public class Person extends Animal {
    private String first, last;
    private int number;
    private static int personCount;
    public Person()
    {
        first = "";
        last = "";
        personCount++;
    }
    public Person(String first, String last)
    {
        this.first = first;
        this.last = last;
        personCount++;
    }
    public Person(String first, String last, byte age)
    {
        this.first = first;
        this.last = last;
        this.age = age;
        personCount++;
    }
    public Person(String first, String last, byte age, int number)
    {
        this.first = first;
        this.last = last;
        this.age = age;
        this.number = number;
        personCount++;
    }
    public String toString()
    {
        String name = "";
        if (first.isEmpty() & last.isEmpty()) return "N/A";
        name += first + " " + last + " ";
        if (number != 0) name += (number % 10000);
        return name;
    }
    public String speak()
    {
        if (first.isEmpty() && last.isEmpty())
        {
            return "I don't have a name.";
        }
        String string = "My name is " + first + " " + last;
        if (age == 0) return string + ".";
        else return string + " and I am " + age + " years old.";

    }
    public static int getPersonCount()
    {
        return personCount;
    }
}
