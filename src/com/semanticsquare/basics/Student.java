class Student {
    int id;
    int minValue = Integer.MIN_VALUE;
    int age = 354;
    long phone = 485_857_8475L;  // needs to end with a "L"
    float gpa = 3.84f;  // needs to end with a "f"; if you don't, it'll be a double literal type
    double gpaTwo = 3.84;  // defaults to double, but you can also end with "d" to indicate it's a double too
    double gpaThree = 3.8e4;  // can do scientific notation too

    void compute() {
        int nextId = id + 1;
        System.out.println(id);
        System.out.println(nextId);
        System.out.println(minValue);
        System.out.println(phone);
        System.out.println(gpa);
        System.out.println(gpaTwo);
        System.out.println(gpaThree);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}