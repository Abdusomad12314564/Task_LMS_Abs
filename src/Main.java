public class Main {
    public static void main(String[] args) {
        Company company = new Company("Kyrgyzstan Bishkek",
                new Java[]{new Java("Abdusomad", 31, 'M', "a.gmail.com"),
                        new Java("Rasul", 19, 'M', "r.gmail.com"),
                        new Java("Aidai", 23, 'F', "ai.gmail.com"),
                        new Java("Maral", 17, 'F', "m.gmail.com"),
                        new Java("Aibek", 41, 'M', "aib.gmail.com")},
                new Android[]{new Android("Xashim", 56, 'M', "h.gmail.com"),
                        new Android("Elena", 22, 'F', "e.gmail.com"),
                        new Android("Aika", 25, 'F', "aika.gmail.com")},
                new Go[]{new Go("Meerim", 18, 'F', "me.gmail.com"),
                        new Go("Abumusa", 26, 'M', "abu.gmail.com")}, "Abdusomad Koshmamatov");

        Company company2 = new Company("Kyrgyzstan Osh",
                new Java[]{new Java("Akyl", 36, 'M', "ak.gmail.com"),
                        new Java("Abdulla", 24, 'M', "ab.gmail.com"),
                        new Java("Begimai", 26, 'F', "b.gmail.com")},
                new Android[]{new Android("Omur", 27, 'M', "o.gmail.com"),
                        new Android("Jenish", 29, 'M', "j.gmail.com")},
                new Go[]{new Go("Hamza", 33, 'M', "hamza.gmail.com")}, "Musa Almazbekov");

        Company [] companies = {company,company2};
        for (Company arr:companies) {
            System.out.println(arr);
        }

    }
}