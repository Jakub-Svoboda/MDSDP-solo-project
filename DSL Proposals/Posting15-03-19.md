# Example
## Introduction
We've tried to create a DSL with focus on reducing the noise surrounding the definition of the layout. Therefore, we have separated declaration of the controls from their definitions. We've also intended for support of template controls which can be reused, and adaptors for lists where the target language can be used to instantiate further instances of templates or the basic controls. We provide one simple and one more complex example to illustrate this below.

We would like our DSL to be language agnostic, and be capable of building to a variety of target languages. However, our initial aim is to make it work for HTML/CSS.

### layout:
This part of the code focuses entirely on what is locate where. It contains a series of nested layouts (horizontal | vertical | form). Each layout contains a series of controls. These are declared with type and name only at this stage (although we have some ideas for making optional inline definitions for flexibility of use).

The intent is to make certain aspects of the layout implied, e.g. a layout would always be vertical unless otherwise is specified.

### controls:
This part defines each control with a limited set of attributes. As each control should be declared in the layout section, we just refer to them by their identifiers here. 

Certain controls (such as input fields) can have some validation rules assigned and other controls (such as buttons) can have a requirement set which would refer to other controls with assigned validation rules. 

### template:
Templates is our implementation of reusable code, where a composite element can be composed, given a name, and consequently referred to another place in the code. This is exemplified in the last example below.

## Simple: Login Form
    layout:
        vertical:
            form validate: 
                label Username
                field email 
                label Password
                field password 
                button login submit
            button register
    controls:
        email:
            validate email
            text "Username"
        password:
            validate password
            text "Password"
        login:
            size large
            text "Login"
            require email && password
        register:
            size small
            text "Register"

## Complex: Social 
    main: 
        layout:
            vertical:
                label header
                list Post
        controls:
            header:
                text="MDSDBook"

    template Post:
        layout:
            vertical:
                label title
                horizontal:
                    label author
                    label timestamp
                GUI content
                Horizontal:
                    button like
                    button share
                    button report
                vertical:
                    horizontal:
                        field comment
                        button submit
                    list comments:
                        CommentBox commentbox
        controls:
            like:
                size small
                text "Like Post"
            share:
                size small
                text "Share Post"
            report:
                size small
                text "Report Comment"
            comment:
                validate=not-empty
            submit:
                require=content

    template CommentBox {
        layout:
            vertical:
                label author
                text-area comment
                label timestamp
                horizontal:
                    button like
                    button report
        controls:
            author:
                size 14px
                color blue
            like:
                size small
                text "Like Comment"
            report:
                size small
                text "Report Comment"

