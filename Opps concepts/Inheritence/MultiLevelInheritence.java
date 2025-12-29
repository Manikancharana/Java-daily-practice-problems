package Inheritence;

class College {
    String clgName = "Jntu-GV";
    String clgLocation = "Vizianagaram";
    int clgRanking = 1256;
}
class Branch extends College{ // Brach class only access the College class 
    String branch1 = "IT";
    String brach2 = "ECE";
    String branch3 ="Mech";
}

class Rank extends Branch{  // Rank class access all properties of Branch and college classes
    int it=10000;
    int ece =12000;
    int mech =30000;
}

public class MultiLevelInheritence {
    public static void main(String[] args) {
        Rank num = new Rank();
        System.out.println("College name : "+num.clgName + " \t Branch name : " + num.branch1 + "\t Rank required :"+ num.it);
    }
}
