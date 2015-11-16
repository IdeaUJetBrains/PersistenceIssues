package data.bug138672;

public class SomeBusinessStuff {

    public SomeEntity someMethod(Long userId, String normalizedMsisdn) {
        SomeEntity someEntity = new SomeEntity();
        someEntity.setId1(normalizedMsisdn);
        someEntity.setId2(userId);
        return someEntity;
    }
}
