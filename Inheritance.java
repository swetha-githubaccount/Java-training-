class Employee {
    void canWork() {
        System.out.println("An employee can work");
    }
}

class JuniorEmployee extends Employee {
    void canCode() {
        System.out.println("A junior employee can code");
    }

    void canPresent() {
        System.out.println("A junior employee can do simple presentation");
    }
}

class SeniorEmployee extends JuniorEmployee {
    void canPresent() {
        System.out.println("A senior employee can do technical presentation");
    }

    void canDebug() {
        System.out.println("A senior employee can debug any hard level code");
    }
}

class LeadEngineer extends SeniorEmployee {
    void canManage() {
        System.out.println("A lead engineer can manage a team");
    }
}

class ExecutiveManager extends SeniorEmployee {
    void canMakeDecisions() {
        System.out.println("An executive manager can make important decisions");
    }
}

class Developer extends Employee {
    void canCode() {
        System.out.println("A developer can code");
    }
}

class TeamLead extends Developer {
    void canLead() {
        System.out.println("A team lead can lead a team");
    }
}

class Inheritance {
    public static void main(String args[]) {
        // Simple Inheritance:
        System.out.println("Simple Inheritance:");
        SeniorEmployee e = new SeniorEmployee();
        e.canPresent();
        e.canCode();
        System.out.println("----------------------------------------------------");

        // Multilevel Inheritance:
        System.out.println("Multilevel Inheritance:");
        LeadEngineer le = new LeadEngineer();
        le.canPresent();
        le.canCode();
        le.canDebug();
        le.canManage();
        System.out.println("----------------------------------------------------");

        // Hierarchical Inheritance:
        System.out.println("Hierarchical Inheritance:");
        ExecutiveManager em = new ExecutiveManager();
        em.canPresent();
        em.canCode();
        em.canDebug();
        em.canMakeDecisions();
        System.out.println("----------------------------------------------------");

        // Hybrid Inheritance:
        System.out.println("Hybrid Inheritance:");
        TeamLead tl = new TeamLead();
        tl.canWork();
        tl.canCode();
        tl.canLead();
    }
}