package dk.sdu.mdsd.guilang.generator.qt

import dk.sdu.mdsd.guilang.generator.GuilangGenerator
import dk.sdu.mdsd.guilang.generator.ILanguageGenerator
import dk.sdu.mdsd.guilang.guilang.BackgroundColor
import dk.sdu.mdsd.guilang.guilang.DimOption
import dk.sdu.mdsd.guilang.guilang.Entity
import dk.sdu.mdsd.guilang.guilang.Option
import dk.sdu.mdsd.guilang.guilang.TextColor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mdsd.guilang.guilang.TextSize

class CSSGenerator extends GuilangGenerator implements ILanguageGenerator {

	new(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		initialise(resource, fsa, context)
	}

	override generate() {
		fsa.generateFile(title + '.css', generateCSS())
	}

	def generateCSS() {
		'''
			�generateDefaults�
			�FOR o : entityOptions.keySet�
				�generateEntity(o)�
			�ENDFOR�
		'''
	}

	def generateEntity(String identifier) {
		if(identifier === null || entityOptions.get(identifier) === null) return ""
		'''
			#�identifier� {
				�FOR o : entityOptions.get(identifier)�
					�o.generateOption�
				�ENDFOR�
			}
		'''
	}

	def dispatch generateOption(Option option) {
		'''''' // Default non-generated option
	}

	def dispatch generateOption(TextColor option) {
		'''
			color: �option.color�;
		'''
	}

	def dispatch generateOption(TextSize option) {
		'''
			size: �option.value�;
		'''
	}

	def dispatch generateOption(BackgroundColor option) {
		if (option.ref === null) {
			'''
				background-color: �option.color�;
			'''
		} else {
			'''
				background-color: �option.ref.value�;
			'''
		}

	}

	def dispatch generateOption(DimOption option) {
		'''
			width: �option.width�;
			height: �option.height�;
		'''
	}

	def generateDefaults() {
		''' 
			.QWidget {
				
			}
			.QVBoxLayout {
				display: flex;
				flex-direction: column;
				width: fit-content;
				justify-content: center;
			}
			.QHBoxLayout {
				display: flex;
				flex-direction: row;
				width: fit-content;
				justify-content: center;
			}
			.QPushButton {
				text-align: center;
				border: none;
				margin: 2px;
			}
			.QLabel {
				margin-right: 10px;
			}
			.QLineEdit{
				margin: 2px;
			}
			.QCheckBox {
				
			}
			.QTextArea {
				margin: 2px;
			}
			.template {
				
			}
			.list {
				
			}
			.small {
				height: 20px;
			}
			.medium {
				height: 40px;
			}
			.large {
				height: 60px;
			}
		'''
	}

}
