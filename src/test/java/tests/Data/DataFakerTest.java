package tests.Data;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

public class DataFakerTest {
    static Faker faker = new Faker(new Locale("Es"));
    static Random random = new Random();

    public String userName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String userEmail = faker.internet().emailAddress();
    public String userGender = genderRandom();
    public String userPhone = faker.phoneNumber().subscriberNumber(10);
    public String currentAddress = faker.address().secondaryAddress();
    public String userDayBirth = String.valueOf(faker.number().numberBetween(1, 31));
    public String userMonthBirth = monthRandom();
    public String userYearBirth = String.valueOf(faker.number().numberBetween(1955 , 2011));
    public String userSubjects = ("English");
    public String userHobbies = hobbiesRandom();
    public String userPicture = ("src/test/resources/1.jpeg");
    public String userCity = cityRandom();
    public String userState = stateRandom(userCity);
    public String button = ("Sumbit");
    public String modalDialog = ("Thanks for submitting the form");


    private String cityRandom() {
        String[] userCity = {"Delhi", "Gurgaon", "Noida", "Agra", "Lucknow","Merrut", "Karnal", "Panipat", "Jaipur", "Jaiselmer"};
        int i = random.nextInt(userCity.length);
        return userCity[i];
    }

    private String stateRandom(String value) {
        HashMap<String, String> cityAndState = new HashMap<>();
        cityAndState.put("Delhi", "NCR");
        cityAndState.put("Gurgaon", "NCR");
        cityAndState.put("Noida", "NCR");
        cityAndState.put("Agra", "Uttar Pradesh");
        cityAndState.put("Lucknow", "Uttar Pradesh");
        cityAndState.put("Merrut", "Uttar Pradesh");
        cityAndState.put("Karnal", "Haryana");
        cityAndState.put("Panipat", "Haryana");
        cityAndState.put("Jaipur", "Rajasthan");
        cityAndState.put("Jaiselmer", "Rajasthan");
        return cityAndState.get(value);
    }


    private String hobbiesRandom() {
        String[] userHobbies = {"Sports", "Reading", "Music"};
        int i = random.nextInt(userHobbies.length);
        return userHobbies[i];
    }

    private String monthRandom() {
        String[] userBirthDate = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
        int i = random.nextInt(userBirthDate.length);
        return userBirthDate[i];
    }

    private String genderRandom() {
        String[] userGender = {"Male", "Female", "Other"};
        int i = random.nextInt(userGender.length);
        return userGender[i];
    }

}
