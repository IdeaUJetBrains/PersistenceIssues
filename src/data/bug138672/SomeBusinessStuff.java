package data.bug138672;

public class SomeBusinessStuff {

    public SomeEntity someMethod(Long userId, String normalizedMsisdn) {
        SomeEntity someEntity = new SomeEntity();
        //todo uncomment to view a bug
        /*someEntity.setId1(normalizedMsisdn);
        someEntity.setId2(userId);*/
        return someEntity;
    }
}
