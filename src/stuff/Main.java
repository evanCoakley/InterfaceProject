package stuff;

public class Main {

    public static void main(String[] args) {

        GroundGrunt grunt = new GroundGrunt();
        System.out.println(grunt.chokeOut());
        System.out.println(grunt.dropDead());
        System.out.println(grunt.highKick());
        System.out.println(grunt.neckBreak());
        System.out.println(grunt.speak());
        System.out.println(grunt.throwPunch());

        ArtillerizeGrunt grunt1 = new ArtillerizeGrunt();
        System.out.println(grunt1.bomber());
        System.out.println(grunt1.fireMortar());
        System.out.println(grunt1.fireRPG());
        System.out.println(grunt1.layClaymore());
        System.out.println(grunt1.speak());


    }


}

