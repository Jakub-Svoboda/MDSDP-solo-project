package dk.sdu.mdsd.guilang.generator.qt

import dk.sdu.mdsd.guilang.generator.GuilangGenerator
import dk.sdu.mdsd.guilang.generator.ILanguageGenerator
import dk.sdu.mdsd.guilang.guilang.Button
import dk.sdu.mdsd.guilang.guilang.Checkbox
import dk.sdu.mdsd.guilang.guilang.Entity
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
import dk.sdu.mdsd.guilang.guilang.SizeOption
import dk.sdu.mdsd.guilang.guilang.TextValidate
import dk.sdu.mdsd.guilang.guilang.Tabs
import dk.sdu.mdsd.guilang.guilang.Tab

class QTGenerator extends GuilangGenerator implements ILanguageGenerator {
	
	var CSSGenerator css
	
	new(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		initialise(resource, fsa, context)
		
		css = new CSSGenerator(resource, fsa, context)
	}
	
	override generate() {
		fsa.generateFile(title + '.ui', generateQT())
		if (gui.debug === false)
		{
			css.generate()			
		}
	}
	
	def generateQT() {
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<ui version="4.0">
		 <class>Dialog</class>
		 <widget class="QDialog" name="Window">
		   <property name="geometry">
		    <rect>
		     <x>0</x>
		     <y>0</y>
		     <width>400</width>
		     <height>500</height>
		    </rect>
		   </property>
		  <property name="windowTitle">
		   <string>Dialog</string>
		  </property>
				«gui.main.layout.generate»
		 </widget>		
		 <resources/>
		 <connections/>
		</ui>
		'''
	}
	
	def generateLayout(Layout layout){
		var String type
		System.out.println("FOOOOOOOOOOOooo")
		System.out.println(layout)
		switch(layout) {
			Vertical: type = "V"
			Horizontal: type = "H"
			Tabs: type = "Tabs"
			Tab: type = "Tab"
		}		
		'''
		«IF type == "Tabs"»
		<widget class="QTabWidget" «IF layout.name !== null»name="«layout.name»«ENDIF»>
		 <property name="geometry">
		    <rect>
		     <x>-1</x>
		     <y>-1</y>
		     <width>400</width>
		     <height>500</height>
		    </rect>
		 </property>
		 <property name="currentIndex">
		  <number>1</number>
		 </property>
		 «FOR e : layout.entities»
		  «e.generate»
		 «ENDFOR»
		 </widget>
		«ENDIF»
		«IF type == "Tab"»
		    <widget class="QWidget" name="tab">
		    <property name="geometry">
		    <rect>
		    <x>-1</x>
		    <y>-1</y>
		    <width>400</width>
		    <height>500</height>
		    </rect>
		    </property>	
		    <attribute name="title">
		    	<string>Tab</string>
		    </attribute>
    		 «FOR e : layout.entities»
	   		 «e.generate»
    		 «ENDFOR» 
		    </widget>
		«ENDIF»     
		«IF type == "H" || type == "V"»
		<widget class="QWidget" «IF layout.name !== null»name="«layout.name»Widget" «ENDIF»>
		<property name="geometry">
		    <rect>
		     <x>-1</x>
		     <y>-1</y>
		     <width>400</width>
		     <height>500</height>
		    </rect>
		   </property>
		   <property name="bottomMargin">
		   <number>50</number>
		   </property>
		<layout class="Q«type»BoxLayout" «IF layout.name !== null»name="«layout.name»Widget" «ENDIF»>
		«FOR e : layout.entities»
			<item>
			«e.generate»
			</item>
		«ENDFOR»
		</layout>
		</widget>
		«ENDIF»
		'''
	}
	
	def dispatch generate(Vertical entity) {
		return generateLayout(entity)
	}
	
	def dispatch generate(Horizontal entity) {
		return generateLayout(entity)
	}
	
	def dispatch generate(Tabs entity){
		return generateLayout(entity)
	}
	
	def dispatch generate(Tab entity){
		return generateLayout(entity)
	}
	
	def dispatch generate(Button entity) {
		'''
		<widget class="QPushButton" name="«entity.name»">
		<property name="text">
		<string>«getTextValue(entity)»</string>
		</property>   
		</widget>   
		'''
	}
	
	def dispatch generate(Label entity) {
		'''
		<widget class="QLabel" name="«entity.name»">
		   <property name="text">
		    <string>«getTextValue(entity)»</string>
		   </property>   
		</widget>   
		'''
	}
	
	def dispatch generate(Input entity) {
		var option = getOption(entity, TextValidate)
		'''
		<widget class="QLineEdit" name="«entity.name»">
		   <property name="text">
		    <string>«getTextValue(entity)»</string>
		   </property>   
		   «IF hasOption(entity, TextValidate) && getOption(entity, TextValidate)?.value !== null » 
		    <property name="inputMask">
		    <string>«getOption(entity, TextValidate)?.value.r»</string>
		    </property>
		   «ENDIF»
		   «IF (option.ref !== null)»
		   <property name="inputMask">
		   <string>«option.ref.value»</string>
		   </property>
		   
		   «ENDIF»
		</widget>   
		'''  
	}
	
	def dispatch generate(Checkbox entity) {
		'''
		<widget class="QCheckBox" name="«entity.name»">
		   <property name="text">
		    <string>«entityOptions.get(entity.name)»</string>
		   </property>   
		</widget>    
		'''
	}
	
	def dispatch generate(TextArea entity) {
		'''
		<widget class="QTextEdit" name="«entity.name»">
		   <property name="text">
		    <string>«getTextValue(entity)»</string>
		   </property>   
		   <property name="sizePolicy">
			 <sizepolicy hsizetype="Expanding" vsizetype="Maximum">
		    <horstretch>0</horstretch>
		       <verstretch>0</verstretch>
		     </sizepolicy>
		    </property> 
		</widget>    
		'''
	}
	
	def dispatch generate(TemplateInstance entity) {
		'''
			«entity.ref.unit.layout.generate»
		'''
	}
	
	def dispatch generate(List entity) {
		'''
		<div id="«entity.name»" class="list«getAdditionalClasses(entity)»"></div>
		'''
	}
	

	
	def getAdditionalClasses(Entity entity) {
		if(entity.name === null || entityOptions.get(entity.name)  === null) return ""
		var res = ""
		for(o : entityOptions.get(entity.name)) {
			switch(o) {
				SizeOption: res += " " + o.value
			}
		}
		return res
	}
}
