import java.util.Arrays;

public class PersonHandler {


    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while(counter < personArray.length){
            // use `counter` to identify the `current Person` in the array
           Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
           String stringRepresentation = String.valueOf(currentPerson);
            // append `stringRepresentation` to `result` variable
           result += stringRepresentation;
            counter++;
        }
        // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        int counter = 0;
        for(counter = 0; counter < personArray.length; counter++){
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String stringRepresentation = String.valueOf(currentPerson);
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;

            // end loop
        }




        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
            for(Person currentPerson : personArray){
                // use the above discoveries to declare for-each-loop signature
                String stringRepresentation = String.valueOf(currentPerson);
                // get `string Representation` of `currentPerson`
                result += stringRepresentation;
                // append `stringRepresentation` to `result` variable

            }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }


}

