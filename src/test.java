public class test {
    public static void main(String[] args) {
        ThroneInheritance t = new ThroneInheritance("king");
        t.birth("king", "andy");
        t.birth("king", "bob");
        t.birth("king", "catherine");
        t.birth("andy", "matthew");
        t.birth("bob", "alex");
        t.birth("bob", "asha");
        t.birth("king", "bob");
        System.out.println(t.getInheritanceOrder());
        t.death("bob");
        System.out.println(t.getInheritanceOrder());
        t.death("alex");
        t.birth("bob","blessing");
        System.out.println(t.getInheritanceOrder());


    }
}
