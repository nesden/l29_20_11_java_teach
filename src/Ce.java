public class Ce {
    public static void main(String[] args) {
        String fullName = "Amitay Gabay";
        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];

        String formatedString = String.format("Welcome to the course: your first name is: %s and your last name is: %s", firstName, lastName);
        System.out.println(formatedString);

        int indexOfLastName = formatedString.indexOf(lastName);
        System.out.println("index of last name: " + indexOfLastName);

        String stringWithoutFirstName = formatedString.replace(firstName, "");
        System.out.println("Result with replace: " + stringWithoutFirstName);

        int startIndex = formatedString.indexOf(firstName);
        int lastIndex = startIndex + firstName.length();
        System.out.println("Result with substring: " +
                formatedString.substring(0, startIndex) + formatedString.substring(lastIndex));

        System.out.println(stringWithoutFirstName.contains(firstName));
        System.out.println(stringWithoutFirstName.contains(lastName));

        System.out.println(stringWithoutFirstName.indexOf(firstName) >= 0 ? true : false);
        System.out.println(stringWithoutFirstName.indexOf(lastName) >= 0 ? true : false);
    }
}
