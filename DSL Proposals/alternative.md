# Grammar
    GUI: 
        'layout' '{'
            entities+=Entitiy*
        '}'
        'config' '{'
            specifications+=Specification*
        '}'
    ;

    Entity:
        { Label } ('label' | 'lbl') name=ID |
        { Button } ('button' | 'btn') name=ID |
        { Field } ('field' | 'input') name=ID |
        { etc... }
    ;

    Specification:
        LabelSpec | ButtonSpec | FieldSpec | etc...
    ;

    LabelSpec:
        ('lbl:' | 'label:') identifier=[Label]

    ;

    Validation:
        val+=[Entity] (ops+=('&&' | '||') val+=[Entity]) // Improve with brackets and nesting
    ;
# Notes
- layout
  - Root object of the layout
  - Default layout is vertical
- Unspecified entities could have some default functionality based on their type and given identifier. 
  - labels could for instance have their value set as the identifier with the first letter capitalised or something
- Should we subclass entities into validatable and non-validatable to make code completion stronger? Not much point in validating a label or a button, or any other entity without changing values.