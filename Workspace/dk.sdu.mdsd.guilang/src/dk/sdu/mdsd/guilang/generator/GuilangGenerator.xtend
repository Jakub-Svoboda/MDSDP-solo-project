/*
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.generator

import dk.sdu.mdsd.guilang.generator.qt.QTGenerator
import dk.sdu.mdsd.guilang.guilang.Entity
import dk.sdu.mdsd.guilang.guilang.GUI
import dk.sdu.mdsd.guilang.guilang.Option
import dk.sdu.mdsd.guilang.guilang.TextValue
import dk.sdu.mdsd.guilang.guilang.impl.GUIImpl
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GuilangGenerator extends AbstractGenerator {

	protected Resource resource
	protected IFileSystemAccess2 fsa
	protected IGeneratorContext context

	protected GUI gui
	protected Map<String, List<Option>> entityOptions
	protected String title

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		initialise(resource, fsa, context)
		
		var ILanguageGenerator generator = new QTGenerator(resource, fsa, context)
		
		generator.generate()
	}
	
	def initialise(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		this.resource = resource
		this.fsa = fsa
		this.context = context
		
		gui = resource.allContents.filter(GUIImpl).next
		populateEntityOptions()
		title = getFileName(resource)
	}
	
	def populateEntityOptions() {
		entityOptions = new HashMap
		
		if(gui.main.specifications !== null){
			for(spec : gui.main.specifications.specifications) {
				entityOptions.put(spec.ref.name, spec.options)
			}
		
		}
		for(template : gui.templates) {
			for(spec : template.unit.specifications.specifications) {
				entityOptions.put(spec.ref.name, spec.options) // Likely candidate for ensuring  template field ids are concatenated with the template id  
			}
		}
	} 
	
	def <T extends Option> T getOption(Entity entity, Class<T> type) {
		if(!entityOptions.containsKey(entity.name)) return null
		for(o : entityOptions.get(entity.name)){
			if(type.isInstance(o))
				return o as T
		}
		return null
	}
	
	def <T extends Option> boolean hasOption(Entity entity, Class<T> type) {
		return getOption(entity, type) !== null
	}
	
	def getFileName(Resource resource) {
		var uri = resource.URI.toString
		return uri.substring(uri.lastIndexOf('/') + 1, uri.length - 4) 
	}
	
	def getTextValue(Entity entity) {
		return getOption(entity, TextValue)?.value
	}	
}
