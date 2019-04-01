package dk.sdu.mdsd.guilang.generator.html

import dk.sdu.mdsd.guilang.generator.GuilangGenerator
import dk.sdu.mdsd.guilang.generator.ILanguageGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class CSSGenerator extends GuilangGenerator implements ILanguageGenerator {
		
	new(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		initialise(resource, fsa, context)
	}
	
	override generate() {
		fsa.generateFile(title + '.css', generateCSS())
	}
	
	def generateCSS() {
		'''
		.vertical {
			display: block;
		}
		.horizontal {
			
		}
		.button {
			
		}
		.label {
			
		}
		.input {
			
		}
		.checkbox {
			
		}
		.text-area {
			
		}
		.template {
			
		}
		.list {
			
		}
		'''
	}
	
	
}