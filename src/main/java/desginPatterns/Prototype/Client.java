package desginPatterns.Prototype;

public class Client {
    public static void fillRegistry(Registry registry){
        Student apr23BeginnerBatch = new Student();
        apr23BeginnerBatch.setBatch("Apr23 Beginner Batch");
        apr23BeginnerBatch.setAvgPSp(70.0);
        registry.register("apr23Beginner", apr23BeginnerBatch);

        IntelligentStudent apr23IntelligentStudent = new IntelligentStudent();
        apr23IntelligentStudent.setBatch("Apr23 Beginner Batch");
        apr23IntelligentStudent.setAvgPSp(70.0);
        apr23IntelligentStudent.setIq(160);
        registry.register("apr23Intelligent", apr23IntelligentStudent);
    }
    public static void main(String[] args) {
     Registry registry = new Registry();
     fillRegistry(registry);

     Student pravallika = registry.getPrototype("apr23Intelligent").clone();
     pravallika.setName("pravs");
     pravallika.setAge(25);
     pravallika.setPsp(100);
     pravallika.setCity("Hyderabad");

        Student sasi = registry.getPrototype("apr23Beginner").clone();
        sasi.setName("Sasi");
        sasi.setPsp(80.9);
        sasi.setAge(25);
      System.out.println(pravallika);
        System.out.println("DEBUG");
    }
}
