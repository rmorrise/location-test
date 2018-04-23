package location.test


import grails.rest.*
import grails.converters.*

class FooController extends RestfulController<Foo> {
	static responseFormats = ['json', 'xml']

    FooController() {
        super(Foo)
    }
}
