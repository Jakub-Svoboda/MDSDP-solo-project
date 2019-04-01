package dk.sdu.mdsd.guilang.generator.html

import dk.sdu.mdsd.guilang.generator.GuilangGenerator
import dk.sdu.mdsd.guilang.generator.ILanguageGenerator
import dk.sdu.mdsd.guilang.guilang.Button
import dk.sdu.mdsd.guilang.guilang.Checkbox
import dk.sdu.mdsd.guilang.guilang.Horizontal
import dk.sdu.mdsd.guilang.guilang.Input
import dk.sdu.mdsd.guilang.guilang.Label
import dk.sdu.mdsd.guilang.guilang.Layout
import dk.sdu.mdsd.guilang.guilang.List
import dk.sdu.mdsd.guilang.guilang.TemplateInstance
import dk.sdu.mdsd.guilang.guilang.TextArea
import dk.sdu.mdsd.guilang.guilang.Vertical
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class HTMLGenerator extends GuilangGenerator implements ILanguageGenerator {
	
	var CSSGenerator css
	
	new(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		initialise(resource, fsa, context)
		
		css = new CSSGenerator(resource, fsa, context)
	}
	
	override generate() {
		fsa.generateFile(title + '.html', generateHTML())
		css.generate()
	}
	
	def generateHTML() {
		'''<html>
			<head>
			<title>«title.toFirstUpper» GUI</title>
			<link rel="stylesheet" type="text/css" href="«title».css"
			</head>
			<body>
				«gui.main.layout.generate»
			</body>
		</html>'''
	}
	
	def generateLayout(Layout layout){
		var String type
		switch(layout) {
			Vertical: type = "vertical"
			Horizontal: type = "horizontal"
		}
		
		'''<div «IF layout.name !== null»id="«layout.name»" «ENDIF»class="«type»">
		«FOR e : layout.entities»
			«e.generate»
		«ENDFOR»
		</div>'''
	}
	
	def dispatch generate(Vertical entity) {
		return generateLayout(entity)
	}
	
	def dispatch generate(Horizontal entity) {
		return generateLayout(entity)
	}
	
	def dispatch generate(Button entity) {
		'''<button id="«entity.name»" class="button">«getTextValue(entity)»</button>'''
	}
	
	def dispatch generate(Label entity) {
		'''<div id="«entity.name»" class="label">«getTextValue(entity)»</div>'''
	}
	
	def dispatch generate(Input entity) {
		'''<input type="text" id="«entity.name»" class="input">«getTextValue(entity)»</div>'''
	}
	
	def dispatch generate(Checkbox entity) {
		'''<input type="checkbox"" id="«entity.name»" class="checkbox"></div>'''
	}
	
	def dispatch generate(TextArea entity) {
		'''<textarea cols="40" rows="5" id="«entity.name»" class="text-area">«getTextValue(entity)»</div>'''
	}
	
	def dispatch generate(TemplateInstance entity) {
		'''<div id="«entity.name»" class="template"></div>'''
	}
	
	def dispatch generate(List entity) {
		'''<div id="«entity.name»" class="list"></div>'''
	}
}
