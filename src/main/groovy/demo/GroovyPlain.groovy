package demo

class GroovyPlain {

    Integer value

    GroovyPlain(Integer value) {
        this.value = value
    }

    void printMessage() {
        println "Here's a plain message: ${value}"
    }

}
