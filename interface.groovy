interface Voice {
    void voice()
    String getName()
    String go()
}


class HRC implements Voice {

    @Override
    void voice() {
        println "Voice"
    }

    @Override
    String getName() {
        return HRC.class.getSimpleName()
    }

    @Override
    String go() {
        "${HRC.class.getSimpleName()} is Moving"
    }
}

def instance = new HRC() as Voice

instance.voice()
println instance.go()
println  "Name is ${instance.getName()}"