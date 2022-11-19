import java.util.Objects;

public class Formatação {
    public static void main(String[] args){

        String x = "Velocidade\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 21\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Ve\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 21;\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 21;Velocidade;\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;\n" +
                " 17;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 17;Velocidade; 91;Distancia; 16;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 15;Velocidade; 90;Distancia; 15;Velocidade; 89;Distancia; 15;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 15;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 15;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 15;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 16;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 106;Velocidade; 90;Distancia; 89;Velocidade; 127;Distancia; 105;Velocidade; 127;Distancia; 104;Velocidade;\n" +
                "Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 62;Velocidade; 128;Distancia; 21;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia;\n" +
                " 127;Distancia; 104;Velocidade; 127;Distancia; 24;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 103;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 102;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 100;Velocidade; 89;Distancia; 100;Velocidade; 89;Distancia; 99;Velocidade; 127;Distancia; 99;Velocidade; 124;Distancia; 99;Velocidade; 123;Distancia; 98;\n" +
                " 127;Distancia; 104;Velocidade; 127;Distancia; 24;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 103;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 102;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 100;Velocidade; 89;Distancia; 100;\n" +
                " 127;Distancia; 104;Velocidade; 127;Distancia; 24;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 103;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 102;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 101;Velocidade; 89;Distancia; 100;Velocidade; 89;Distancia; 100;Velocidade; 89;Distancia; 99;Velocidade; 127;Distancia; 99;Velocidade; 124;Distancia; 99;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 97;Velocidade; 123;Distancia; 97;Velocidade; 123;Distancia; 96;Velocidade; 123;Distancia; 96;Velocidade; 123;Distancia; 84;Velocidade; 124;Distancia; 95;Velocidade; 123;Distancia; 95;Velocidade; 123;Distancia; 94;Velocidade; 123;Distancia; 93;Velocidade; 123;Distancia; 93;Velocidade; 123;Distancia; 92;Velocidade; 123;Distancia; 92;Velocidade; 123;Distancia; 91;Velocidade; 123;Distancia; 91;Velocidade; 123;Distancia; 90;Velocidade; 123;Distancia; 90;Velocidade; 123;Distancia; 90;Velocidade; 123;Distancia; 90;Velocidade; 123;Distanci\n" +
                "a; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 88;Velocidade; 123;Distancia; 87;Velocidade; 124;Distancia; 87;Velocidade; 124;Distancia; 87;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 87;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 85;\n" +
                "a; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 89;Velocidade; 123;Distancia; 88;Velocidade; 123;Distancia; 87;Velocidade; 124;Distancia; 87;Velocidade; 124;Distancia; 87;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 87;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 86;Velocidade; 63;Distancia; 85;Velocidade; 63;Distancia; 84;Velocidade; 63;Distancia; 84;Velocidade; 63;Distancia; 83;Velocidade; 63;Distancia; 83;Velocidade; 63;Distancia; 83;Velocidade; 63;Distancia; 82;Velocidade; 63;Distancia; 82;\n" +
                "Velocidade; 63;Distancia; 127;Velocidade; 63;Distancia; 119;Velocidade; 63;Distancia; 120;Velocidade; 63;Distancia; 118;Velocidade; 63;Distancia; 118;Velocidade; 63;Distancia; 162;Velocidade; 63;Distancia; 161;Velocidade; 63;Distancia; 161;Velocidade; 63;Distancia; 160;Velocidade; 63;Distancia; 159;Velocidade; 63;Distancia; 144;Velocidade; 63;Distancia; 144;Velocidade; 63;Distancia; 143;Velocidade; 63;Distancia; 143;Velocidade; 63;Distancia; 157;Velocidade; 63;Distancia; 156;Velocidade; 63;Distancia; 141;Velocidade; 63;Distancia; 140;Velocidade; 63;Distancia; 140;Velocidade; 63;Distancia; 139;Velocidade; 63;Distancia; 137;Velocidade; 63;Distancia; 136;Velocidade; 63;Distancia; 136;Velocidade\n" +
                "locidade; 124;Distancia; 129;Velocidade; 124;Distancia; 128;Velocidade; 124;Distancia; 128;Velocidade; 124;Distancia; 128;Velocidade; 124;Distancia; 128;Velocidade; 124;Distancia; 16;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 125;Velocidade; 89;Distancia; 112;Velocidade; 89;Distancia; 82;Velocidade; 127;Distancia; 15;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 103;Velocidade; 89;Dist\n" +
                "89;Distancia; 72;Velocidade; 127;Distancia; 15;Velocidade; 90;Distancia; 70;Velocidade; 127;Distancia; 15;Velocidade; 90;Distancia; 70;Velocidade; 127;Distancia; 16;Velocidade; 90;Distancia; 69;Velocidade; 127;Distancia; 16;Velocidade; 90;Distancia; 67;Velocidade; 127;Distancia; 17;Velocidade; 91;Distancia; 67;Velocidade; 127;Distancia; 66;Velocidade; 127;Distancia; 65;Velocidade; 128;Distancia; 65;Velocidade; 128;Distancia; 65;Velocidade; 128;Distancia; 64;Velocidade; 128;Distancia; 63;Velocidade; 128;Distancia; 63;Velocidade; 67;Distancia; 63;Velocidade; 67;Distancia; 63;\n" +
                "Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 54;Velocidade; 67;Distancia; 54;Velocidade; 67;Distancia; 53;Velocidade; 67;Distancia; 52;Velocidade; 67;Distancia; 52;Velocidade; 67;Distancia; 52;Velocidade; 67;Distancia; 51;Velocidade; 67;Distancia; 51;Velocidade; 67;Distancia; 51;Velocidade; 67;Distancia; 50;Velocidade; 67;Distancia; 50;Velocidade; 67;Distancia; 51;Velocidade; 67;Distancia; 51;Velocidade; \n" +
                "Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 55;Velocidade; 67;Distancia; 54;Velocidade; 67;Distancia; 54;Velocidade; 67;Distancia; 53;Velocidade; 67;Distancia; 52;Velocidade; 67;Distancia; 52;Velocidade; 67;Distancia; 52;Velocidade; 67;Distancia; 51;Velocidade; 67;Distancia; 51;Velocidade; 67;Distancia\n" +
                "dade; 89;Distancia; 31;Velocidade; 118;Distancia; 17;Velocidade; 91;Distancia; 14;Velocidade; 86;Distancia; 18;Velocidade; 91;Distancia; 14;Velocidade; 86;Distancia; 17;Velocidade; 91;Distancia; 27;Velocidade; 90;Distancia; 254;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 18;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 18;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 18;Velocidade; 63;Distancia; 18;Velocidade; 63;Distancia; 19;Velocidade; 63;Distancia; 18;Velocidade; 63;Distancia; 20;Velocidade; 63;Distancia; 18;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 19;Velocidade; 63;Distancia; 19;Velocidade; 63;Distancia; 21;Velocida\n" +
                "Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 22;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 24;Velocidade; 63;Distancia; 24;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 24;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 24;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 20;Velocidade; 63;Distancia; 20;Velocidade; 63;Distancia; 24;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 20;Velocidade; 63;Distancia; 20;Velocidade; 63;Distancia; 23;\n" +
                "Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 20;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 23;Velocidade; 63;Distancia; 20;Velocidade; 63;Distancia; 21;Velocidade; 63;Distancia; 23;Velocidade; 74;Distancia; 21;Velocidade; 91;Distancia; 23;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 8\n" +
                "tancia; 26;Velocidade; 118;Distancia; 23;Velocidade; 90;Distancia; 28;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;\n" +
                "a; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 14;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 14;Velocidade; 90;Distancia; 14;Velocidade; 84;Distancia; 14;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 14;Velocidade; 90;Distancia; 15;\n" +
                "Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distan\n" +
                "dade; 90;Distancia; 23;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 79;Velocidade; 127;Distancia; 79;Velocidade; 125;Distancia; 27;Velocidade; 90;Distancia; 66;Velocidade; 127;Distancia; 77;Velocidade; 125;Distancia; 29;Velocidade; 91;Distancia; 76;Velocidade; 126;Distancia; 19;Velocidade; 91;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 72;Velocidade; 127;Distancia; 23;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 17;Velocidade; 90;Di\n" +
                "stancia; 16;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 26;Velocidade; 89;Distancia; 67;Velocidade; 127;Distancia; 21;Velocidade; 91;Distancia; 22;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 66;Velocidade; 127;Distancia; 30;Velocidade; 91;Distancia; 22;Velocidade; 90;Distancia; 64;Velocidade; 128;Distancia; 64;Velocidade; 128;Distancia; 63;Velocidade; 128;Distancia; 24;Velocidade; 90;Distancia; 63;Velocidade; 128;Distancia; 62;Velocidade; 128;Distancia; 62;Velocidade; 128;Distancia; 28;Velocidade; 90;Distancia; 61;Velocidade; 129;Distancia; 61;Velocidade; 129;Distancia; 60;Velocidade; 129;Distancia; 60;Velocidade; 129;Distancia; 60;Velocidade; 129;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 58;Velocidade; 127;Distancia; 58;Velocidade; 127;Distancia; 58;Velocidade; 127;Distancia; 58;Velocidade; 127;Distancia; 57;Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 56\n" +
                "44;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 42;Velocidade; 125;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 45;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 61;Velocidade; 129;Distancia; 44;Velocidade; 124;Dis\n" +
                "44;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 42;Velocidade; 125;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 45;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 61;Velocidade; 129;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 42;Velocidade; 125;Distancia; 132;Velocidade; 125;Distancia; 79;Velocidade; 125;Distancia; 165;Velocidade; 125;Distancia; 139;Velocidade; 125;Distancia; 134;Velocidade; 125;Distancia; 149;Velocidade; 125;Distancia; 136;Velocidade; 125;Distancia; 136;Velocidade; 125;Distancia; 148;Velocidade; 125;Distancia; 135;Velocidade; 125;Distancia; 145;Velocidade; 125;Dista\n" +
                "elocidade; 91;Distancia; 94;Velocidade; 126;Distancia; 95;Velocidade; 124;Distancia; 79;Velocidade; 125;Distancia; 19;Velocidade; 91;Distancia; 18;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 93;Velocidade; 127;Distancia; 94;Velocidade; 124;Distancia; 124;Velocidade; 124;Distancia; 124;Velocidade; 124;Distancia; 123;Velocidade; 124;Distancia; 123;Velocidade; 124;Distancia; 122;Velocidade; 124;Distancia; 122;Velocidade; 124;Distancia; 123;Velocidade; 124;Distancia; 125;Velocidade; 124;Distancia; 76;Velocidade; 125;Distancia; 76;Velocidade; 125;Distancia; 75;Velocidade; 126;Distancia; 75;Velocidade; 126;Distancia; 74;Velocidade; 126;Distancia; 74;Velocidade; 126;Distancia; 73;Velocidade; 126;Distancia; 73;Velocidade; 126;Distancia; 72;Velocidade;\n" +
                "ia; 73;Velocidade; 126;Distancia; 1186;Velocidade; 126;Distancia; 69;Velocidade; 127;Distancia; 1186;Velocidade; 127;Distancia; 134;Velocidade; 127;Distancia; 133;Velocidade; 127;Distancia; 134;Velocidade; 127;Distancia; 132;Velocidade; 127;Distancia; 134;Velocidade; 127;Distancia; 131;Velocidade; 127;Distancia; 131;Velocidade; 127;Distancia; 132;Velocidade; 127;Distancia; 130;\n" +
                "ncia; 116;Velocidade; 90;Distancia; 1186;Velocidade; 90;Distancia; 1186;Velocidade; 90;Distancia; 28;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; \n" +
                "Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 26;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 26;Velocidade; 93;Distancia; 25;Velocidade; 93;Distancia; 25;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 24;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 20;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 20;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 21;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 22;Velocidade; 93;Distancia; 23;Velocidade; 93;Distancia; 23;\n" +
                "locidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Veloci\n" +
                "elocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 22;Velocidade; 89;\n" +
                "Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 22;Vel\n" +
                "Velocidade; 90;Distancia; 32;Velocidade; 89;Distancia; 107;Velocidade; 89;Distancia; 28;Velocidade; 118;Distancia; 106;Velocidade; 118;Distancia; 105;Velocidade; 118;Distancia; 105;Velocidade; 118;Distancia; 104;Velocidade; 118;Distancia; 104;Velocidade; 118;Distancia; 104;Velocidade; 118;Distancia; 103;Velocidade; 118;Distancia; 103;Velocidade; 118;Distancia; 103;Velocidade; 118;Distancia; 102;Velocidade; 118;Distancia; 101;Velocidade; 118;Distancia; 101;Velocidade; 118;Distancia; 101;Velocidade; 118;Distancia; 101;Velocidade; 118;Distancia; 100;Velocidade; 118;Distancia; 100;Velocidade;\n" +
                ";Distancia; 153;Velocidade; 71;Distancia; 112;Velocidade; 71;Distancia; 150;Velocidade; 71;Distancia; 163;Velocidade; 71;Distancia; 131;Velocidade; 71;Distancia; 109;Velocidade; 71;Distancia; 110;Velocidade; 71;Distancia; 148;Velocidade; 71;Distancia; 146;Velocidade; 71;Distancia; 144;Velocidade; 71;Distancia; 144;Velocidade; 71;Distancia; 143;Velocidade; 71;Distancia; 142;Velocidade; 71;Distancia; 143;Velocidade; 71;Distancia; 124;Velocidade; 71;Distancia; 141;Velocidade; 71;Distancia; 136;Velocidade; 71;Distancia; 155;Velocidade; 71;Distancia; 102;Velocidade; 71;Dist\n" +
                "Velocidade; 127;Distancia; 69;Velocidade; 127;Distancia; 68;Velocidade; 127;Distancia; 67;Velocidade; 127;Distancia; 67;Velocidade; 127;Distancia; 65;Velocidade; 128;Distancia; 65;Velocidade; 128;Distancia; 64;Velocidade; 128;Distancia; 64;Velocidade; 128;Distancia; 64;Velocidade; 128;Distancia; 64;Velocidade; 128;Distancia; 63;Velocidade; 128;Distancia; 63;Velocidade; 128;Distancia; 63;Velocidade; 128;Distancia; 17;Velocidade; 90;Distancia; 15;Velocidade; 89;Distancia; 61;Velocidade; 129;Distancia; 27;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 60;Velocidade; 129;Distancia; 60;Velocidade; 129;Distancia; 59;Velocidade; 128;Distancia; 15;Velocidade; 90;Distancia; 59;Velocidade; 128;Distancia; 58;Velocidade; 127;Distancia; 58;Velocidade; 127;Distancia; 57;\n" +
                "ocidade; 125;Distancia; 734;Velocidade; 125;Distancia; 220;Velocidade; 125;Distancia; 211;Velocidade; 125;Distancia; 217;Velocidade; 125;Distancia; 214;Velocidade; 125;Distancia; 213;Velocidade; 125;Distancia; 213;Velocidade; 125;Distancia; 263;Velocidade; 125;Distancia; 262;Velocidade; 125;Distancia; 179;Velocidade; 125;Distancia; 13;Velocidade; 84;Distancia; 261;Velocidade; 84;Distancia; 12;Velocidade; 90;Distancia; 204;Velocidade; 90;Distancia; 291;Velocidade; 90;Distancia; 11;Velocidade; 82;Distancia; 27;Velocidade; 116;Distancia; 19;Velocidade; 91;Distancia; 259;Velocidade; 91;Distancia; 28;Velocidade; 90;Distancia; 11;Velocidade; 82;Distancia; 15;Velocidade; 90;Distancia; 12;Velocidade; 84;Distancia; 18;Velocidade; 91;Distancia; 15;Velocidade; 90;Distancia; 29;Velocidade; 89;Distancia; 9;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 11;Velocidade; 82;Distancia; 254;Velocidade; 82;Distancia; 8;Velocidade; 90;Distancia; 8;Velocidade; 74;Distancia; 19;Velocidade; 91;Distan\n" +
                "idade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 20;Velo\n" +
                "Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 26;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 27;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 22;Velocidade; 90;Distancia; 20;\n" +
                "Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 16;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 15;Velocidade; 90;Distancia; 14;Velocidade; 84;Distancia; 16;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 18;\n" +
                "90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;\n" +
                "Velocidade; 126;Distancia; 24;Velocidade; 90;Distancia; 28;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 71;Velocidade; 127;Distancia; 23;Velocidade; 90;Distancia; 71;Velocidade; 127;Distancia; 70;Velocidade; 127;Distancia; 69;Velocidade; 127;Distancia; 69;Velocidade; 127;Distancia; 68;Velocidade; 127;Distancia; 68;Velocidade; 127;Distancia; 67;Velocidade; 127;Distancia; 67;Velocidade; 127;Distancia; 67;Velocidade; 127;Distancia; 66;Velocidade; 127;Distancia; 66;Velocidade; 127;Distancia; 65;Velocidade; 128;Distancia; 23;Velocidade; 90;Distancia; 29;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 23;\n" +
                "Velocidade; 123;Distancia; 49;Velocidade; 123;Distancia; 49;Velocidade; 123;Distancia; 48;Velocidade; 123;Distancia; 25;Velocidade; 89;Distancia; 48;Velocidade; 127;Distancia; 48;Velocidade; 124;Distancia; 47;Velocidade; 123;Distancia; 47;Velocidade; 123;Distancia; 47;Velocidade; 123;Distancia; 46;Velocidade; 123;Distancia; 46;Velocidade; 123;Distancia; 46;Velocidade; 123;Distancia; 45;Velocidade; 124;Distancia; 45;Velocidade; 124;Distancia; 45;Velocidade; 124;Distancia; 45;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 42;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 41;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 42;\n" +
                "ncia; 112;Velocidade; 127;Distancia; 112;Velocidade; 69;Distancia; 111;Velocidade; 69;Distancia; 111;Velocidade; 69;Distancia; 111;Velocidade; 69;Distancia; 110;Velocidade; 69;Distancia; 110;Velocidade; 69;Distancia; 109;Velocidade; 69;Distancia; 109;Velocidade; 69;Distancia; 108;Velocidade; 69;Distancia; 108;Velocidade; 69;Distancia; 108;Velocidade; 69;Distancia; 107;Velocidade; 69\n" +
                "Distancia; 74;Velocidade; 126;Distancia; 74;Velocidade; 126;Distancia; 73;Velocidade; 126;Distancia; 73;Velocidade; 126;Distancia; 73;Velocidade; 126;Distancia; 73;Velocidade; 126;Distancia; 72;Velocidade; 126;Distancia; 72;Velocidade; 126;Distancia; 72;Velocidade; 126;Distancia; 71;Velocidade; 126;Distanc\n" +
                "Velocidade; 127;Distancia; 69;Velocidade; 127;Distancia; 71;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 72;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 137;Velocidade; 126;Distancia; 135;Velocidade; 126;Distancia; 135;Velocidade; 126;Distancia; 134;Velocidade; 126;Distancia; 1186;Velocidade; 126;Distancia; 132;Velocidade; 126;Distancia; 131;Velocidade; 126;Distancia; 131;Velocidade; 126;Distancia; 131;Velocidade; 126;Distancia; 131;Velocidade; 126;Distancia; 131;\n" +
                "locidade; 126;Distancia; 1186;Velocidade; 126;Distancia; 1186;Velocidade; 126;Distancia; 30;Velocidade; 91;Distancia; 31;Velocidade; 90;Distancia; 32;Velocidade; 89;Distancia; 31;Velocidade; 118;Distancia; 31;Velocidade; 91;Distancia; 31;Velocidade; 90;Distancia; 31;Velocidade; 89;Dista\n" +
                "6;Velocidade; 118;Distancia; 26;Velocidade; 90;Distancia; 26;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 26;Velocidade; 90;Distancia; 26;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 30;Velocidade; 91;Distancia; 26;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 28;Velocidade; 91;Distancia; 25;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 25;Velocidade; 8\n" +
                "Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 26;Velocidade; 90;Distancia; 26;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 26;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 25;\n" +
                "Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Veloci\n" +
                "ade; 89;Distancia; 17;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 19;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 26;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 22;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 20;Velocidade; 90;Distancia; 19;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 16;Velocidade; 89;Distancia; 19;\n" +
                "Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 17;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 17;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 18;Velocidade; 90;Distancia; 18;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 24;Velocidade; 90;Distancia; 20;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 21;Velocidade; 91;Distancia; 21;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 30;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 21;Velocidade; 91;Distancia; 22;\n" +
                "elocidade; 89;Distancia; 109;Velocidade; 90;Distancia; 108;Velocidade; 90;Distancia; 30;Velocidade; 90;Distancia; 25;Velocidade; 90;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 90;Distancia; 25;Velocidade; 90;Distancia; 106;Velocidade; 90;Distancia; 24;Velocidade; 90;Distancia; 105;Velocidade; 90;Distancia; 105;Velocidade; 90;Distancia; 104;Velocidade; 90;Distancia; 104;Velocidade; 90;Distancia; 104;Velocidade; 90;Distancia; 103;Velocidade; 90;Distancia; 103;Velocidade; 90;Distancia; 103;Velocidade; 90;Distancia; 102;Velocidade; 90;Distancia; 101;Velocidade; 90;Distancia; 101;Velocidade; 90;Distancia; 101;Velocidade; 90;Distancia; 100;Velocidade; 90;Distancia; 99;Velocidade; 90;Distancia; 99;Velocidade; 90;Distancia; 99;Velocidade; 90;Distancia; 100;Velocidade; 90;Distancia; 98;Velocidade; 90;Distancia; 96;Velocidade; 90;Distancia; 98;\n" +
                "24;Distancia; 84;Velocidade; 124;Distancia; 83;Velocidade; 124;Distancia; 83;Velocidade; 124;Distancia; 83;Velocidade; 124;Distancia; 83;Velocidade; 124;Distancia; 83;Velocidade; 124;Distancia; 82;Velocidade; 124;Distancia; 82;Velocidade; 124;Distancia; 82;Velocidade; 124;Distancia; 82;Velocidade; 124;Distancia; 82;Velocidade; 124;Distancia; 82;Velocidade; 124;Distancia; 82;Velocidade; 124;Distancia; 83;Velocidade; 124;Distancia; 167;Velocidade; 124;Distancia; 138;Velocidade; 124;Distancia; 107;Velocidade; 124;Distancia; 148;Velocidade; 124;Distancia; 166;Velocidade; 124;Distancia; 153;Velocidade; 124;Distancia; 88;Velocidade; 123;Distancia; 150;Velocidade; 123;Distancia; 164;Velocidade; 123;Distancia; 150;Velocidade; 123;Distancia; 150;Velocidade; 123;Distancia; 147;Velocidade; 123;Distancia; 162;Velocidade; 123;Distancia; 162;Velocidade; 123;Distancia; 111;Velocidade; 123;Distancia; 93;Velocidade; 123;Distancia; 161;Velocidade; 123;Distancia; 128;Velocidade; 123;Distancia; 91;Velocidade; 123;Distancia; 160;Velocidade; 123;Distancia; 124;Velocidade; 123;Distancia; 91;Velocidade; 123;Distancia; 159;\n" +
                "dade; 67;Distancia; 87;Velocidade; 67;Distancia; 86;Velocidade; 67;Distancia; 85;Velocidade; 67;Distancia; 85;Velocidade; 67;Distancia; 84;Velocidade; 67;Distancia; 84;Velocidade; 67;Distancia; 84;Velocidade; 67;Distancia; 83;Velocidade; 67;Distancia; 83;Velocidade; 67;Distancia; 83;Velocidade; 67;Distancia; 82;Velocidade; 67;Distancia; 81;Velocidade; 67;Distancia; 80;Velocidade; 67;Distancia; 80;Velocidade; 67;Distancia; 80;Velocidade; 67;Distancia; 79;Velocidade; 67;Distancia; 79;Velocidade; 67;Distancia; 78;Velocidade; 67;Distancia; 78;Velocidade; 67;Distancia; 77;Velocidade; 67;Distancia; 76;Velocidade; 125;Distancia; 75;Velocidade; 126;Distancia; 75;Velocidade; 126;Distancia; 75;Veloci\n" +
                "Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 56;Velocidade; 125;Distancia; 56;Velocidade; 125;Distancia; 56;Velocidade; 125;Distancia; 55;Velocidade; 125;Distancia; 55;Velocidade; 125;Distancia; 54;Velocidade; 124;Distancia; 54;Velocidade; 124;Distancia; 53;Velocidade; 123;Distancia; 53;Velocidade; 123;Distancia; 52;Velocidade; 123;Distancia; 52;Velocidade; 123;Distancia; 51;Velocidade; 123;Distancia; 51;Velocidade; 123;Distancia; 51;Velocidade; 123;Distancia; 50;Velocidade; 123;Distancia; 50;Velocidade; 123;Distancia; 50;Velocidade; 123;Distancia; 50;Velocidade; 123;Distancia; \n" +
                "locidade; 123;Distancia; 138;Velocidade; 123;Distancia; 138;Velocidade; 123;Distancia; 136;Velocidade; 123;Distancia; 136;Velocidade; 123;Distancia; 137;Velocidade; 123;Distancia; 135;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 135;Velocidade; 123;Distancia; 254;Velocidade; 123;Distancia; 43;Velocidade; 124;Distancia; 44;Velocidade; 124;Distancia; 42;Velocidade; 125;Distancia; 41;Velocidade; 125;Distancia; 41;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 41;Velocidade; 125;Distancia; 43;Velocidade; 124;Distancia; 42;Velocidade; 125;Distancia; 41;Velocidade; 125;Distancia; 44;Velocidade; 124;Distancia; 41;Velocidade; 125;Distancia; 42;Velocidade; 125;Distancia; 41;Velocidade; 125;Distancia; 42;\n" +
                "3;Distancia; 42;Velocidade; 103;Distancia; 42;Velocidade; 103;Distancia; 41;Velocidade; 103;Distancia; 42;Velocidade; 103;Distancia; 43;Velocidade; 103;Distancia; 41;Velocidade; 103;Distancia; 42;Velocidade; 103;Distancia; 42;Velocidade; 103;Distancia; 42;Velocidade; 103;Distancia; 43;Velocidade; 103;Distancia; 41;Velocidade; 103;Distancia; 43;Velocidade; 103;Distancia; 41;Velocidade; 103;Distancia; 43;Velocidade; 103;Distancia; 41;Velocidade; 103;Distancia; 42;Velocidade; 103;Distancia; 41;Velocidade; 103;Distancia; 42;Velocidade; 103;Distancia; 41;\n" +
                "31;Velocidade; 89;Distancia; 31;Velocidade; 118;Distancia; 30;Velocidade; 91;Distancia; 30;Velocidade; 90;Distancia; 30;Velocidade; 89;Distancia; 30;Velocidade; 118;Distancia; 30;Velocidade; 91;Distancia; 32;Velocidade; 90;Distancia; 31;Velocidade; 89;Distancia; 31;Velocidade; 118;Distancia; 31;Velocidade; 91;Distancia; 34;Velocidade; 90;Distancia; 28;Velocidade; 89;Distancia; 28;Velocidade; 118;Distancia; 34;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 28;Velocidade; 118;Distancia; 28;Velocidade; 91;Distancia; 28;Velocidade; 90;Distancia; 29;Velocidade; 89;Distancia; 27;Velocidade; \n" +
                "Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 24;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 24;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 24;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 26;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 25;Velocidade; 118;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23\n" +
                "de; 128;Distancia; 62;Velocidade; 128;Distancia; 61;Velocidade; 129;Distancia; 61;Velocidade; 129;Distancia; 61;Velocidade; 129;Distancia; 60;Velocidade; 129;Distancia; 60;Velocidade; 129;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 59;Velocidade; 128;Distancia; 58;Velocidade; 127;Distancia; 58;Velocidade; 127;Distancia; 57;Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 57;Velocidade; 126;Distancia; 56;Velocidade; 125;Distancia; 56;Velocidade; 125;Distancia; 56;Velocidade; 125;Distancia; 55;Velocidade; 125;Distancia; 55;Velocidade; 125;Distancia; 55;Velocidade; 125;Distancia; 54;Velocidade; 124;Distancia; 54;Velocidade; 124;Distancia; 53;Velocidade; 123;Distancia; 53;Velocidade; 123;Distancia; 53;Velocidade; 123;Distancia; 52;Velocidade; 123;Distancia; 52;Velocidade; 123;Distancia; 51;Velocidade; 123;Distancia; 51;Velocidade; 123;Distancia; 51;Velocidade; 123;Distancia; 50;\n" +
                "111;Distancia; 169;Velocidade; 111;Distancia; 118;Velocidade; 111;Distancia; 157;Velocidade; 111;Distancia; 42;Velocidade; 111;Distancia; 232;Velocidade; 111;Distancia; 80;Velocidade; 111;Distancia; 134;Velocidade; 111;Distancia; 121;Velocidade; 111;Distancia; 121;Velocidade; 111;Distancia; 120;Velocidade; 111;Distancia; 117;Velocidade; 111;Distancia; 117;Velocidade; 111;Distancia; 117;Velocidade;\n" +
                "Distancia; 101;Velocidade; 125;Distancia; 101;Velocidade; 125;Distancia; 101;Velocidade; 125;Distancia; 100;Velocidade; 125;Distancia; 100;Velocidade; 125;Distancia; 99;Velocidade; 123;Distancia; 99;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 98;Velocidade; 123;Distancia; 97;Velocidade; 123;Distancia; 97;Velocidade; 123;Distancia; 96;Velocidade; 123;Distancia; 96;Velocidade; 123;Distancia; 97;Velocidade; 123;Distancia; 127;Velocidade; 123;Distancia; 127;Velocidade; 123;Distancia; 127;Velocidade; 123;Distancia; 127;Velocidade; 123;Distancia; 127;Velocidade; 123;Distancia; 126;Velocidade; 123;Distancia; 93;Velocidade; 123;Distancia; 92;Velocidade; 123;Distancia; 93;Velocidade; 123;Distancia; 92;Velocidade; 123;Distancia; 125;Velocidade; 123;Distancia; 125;Velocidade; 123;Distancia; 125;Velocidade; 123;Distancia; 124;Velocidade; 123;Distancia; 124;Velocidade; 123;Distancia; 123;Velocidade; 123;Distancia; 122;Velocidade; 123;Distancia; 122;Velocidade; 123;Distancia; 121;Velocidade; 123;Distancia; 121;Velo\n" +
                "de; 126;Distancia; 72;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 70;Velocidade; 127;Distancia; 70;Velocidade; 127;Distancia; 70;Velocidade; 127;Distancia; 70;Velocidade; 127;Distancia; 70;Velocidade; 127;Distancia; 70;Velocidade; 127;Distancia; 71;Velocidade; 126;Distancia; 70;Velocidade; 127;Distancia; 71;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 71;Velocidade; 126;Distancia; 70;Velocidade; 127;Distancia; 69;Velocidade; 127;Distancia; 69;Velocidade; 127;Distancia; 69;Velocidade; 127;Distancia; 1186;Velocidade; 127;Distancia; 1186;Velocidade; 127;Distancia; 133;Ve\n" +
                "Velocidade; 128;Distancia; 36;Velocidade; 128;Distancia; 36;Velocidade; 128;Distancia; 35;Velocidade; 128;Distancia; 38;Velocidade; 127;Distancia; 38;Velocidade; 127;Distancia; 40;\n" +
                "Velocidade; 89;Distancia; 30;Velocidade; 118;Distancia; 30;Velocidade; 91;Distancia; 31;Velocidade; 90;Distancia; 30;Velocidade; 89;Distancia; 30;Velocidade; 118;Distancia; 30;Velocidade; 91;Distancia; 30;Velocidade; 90;Distancia; 30;Velocidade; 89;Distancia; 31;Velocidade; 118;Distancia; 30;Velocidade; 91;Distancia; 31;Velocidade; 90;Distancia; 29;Velocidade; 89;Distancia; 31;Velocidade; 118;Distancia; 31;Velocidade; 91;Distancia; 31;Velocidade; 90;Distancia; 30;\n" +
                "idade; 118;Distancia; 28;Velocidade; 91;Distancia; 27;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 26;Velocidade; 90;Distancia; 25;Velocidade; 89;Distancia; 27;Velocidade; 118;Distancia; 25;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 27;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 26;Velocidade; 89;Distancia; 24;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 26;\n" +
                "istancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidad\n" +
                "istancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 23;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 23;Velocidade; 89;Distancia; 26;Velocidade; 118;Distancia; 26;Velocidade; 90;Distancia; 24;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia; 21;Velocidade; 90;Distancia; 22;Velocidade; 89;Distancia; 22;Velocidade; 90;Distancia; 21;Velocidade; 89;Distancia\n";
        int total=0;

        for (int i=0;i<=x.length()-1;i++) {
            if (x.substring(i,i+1).equalsIgnoreCase(";"))
                total=total+1;
            if (total%4==0){
                System.out.println();
            }
        }
        System.out.println(x);
    }
}
#include <Fuzzy.h>
//Include the SoftwareSerial library
        #include "SoftwareSerial.h"


//Create a new software  serial
        SoftwareSerial bluetooth(50, 52); //TX, RX (Bluetooth)


        int vel.Fuzzy = 0;
        int velMax = 140;
        int velMin = 0;
        int velocidade = 0;
        int velBlue = 0;
        int velPadrao = 140;
        int velCurva = 70;
        int estado = 0; // 1 = bluetooth, 2 - fuzzy, 3 - curva
        boolean aux = false;
        boolean auxLed = false;
        String texto = "";
        int ledPin = 46;
        double distInicial = 0;
        double distFinal = 0;
        unsigned long tempoInicial = 0;
        unsigned long tempoFinal = 0;
        unsigned long tempo = 0;
        double velcar = 0;
        int inicio = 0;

class Motor {
    int vel = 255, M1, DIR1;

    public:

    void Pinout(int in1, int in2) { // Pinos para controle do motor
        M1 = in1;
        DIR1 = in2;
        pinMode(M1, OUTPUT);
        pinMode(DIR1, OUTPUT);
    }
    void Velocidade(int vel1) { // Speed é o método que irá ser responsável por salvar a velocidade de atuação do motor
        vel = vel1;
    }
    void Andar() { // Forward é o método para fazer o motor girar para frente
        analogWrite(M1, vel);
        digitalWrite(DIR1, LOW);
    }
    void Parar() { // Stop é o metodo para fazer o motor ficar parado.
        digitalWrite(M1, LOW);
        digitalWrite(M1, LOW);
    }
};

Motor Motor1, Motor2; // Criação de dois objetos motores, já que usaremos dois motores, e eles já estão prontos para receber os comandos já configurados acima.

//Sensores de linha
class Sensor {
    int pin_S1, pin1;
    public:

    void Pinout(int pin1){
        pin_S1 = pin1;
        pinMode(pin_S1, INPUT);
    }
    int Ler(){ // Ler sensor
        int sensor = digitalRead(pin_S1);
        return sensor;
    }

};


Sensor Sensor1, Sensor2, Sensor3, Sensor4, Sensor5;
class SensorDist {
    int echoPin, trigPin, distance;
    long tempo;

    public:

    void Pinout(int pin1, int pin2) {
        echoPin = pin1;
        trigPin = pin2;
        pinMode(trigPin, OUTPUT); // Seta o trigPin como OUTPUT
        pinMode(echoPin, INPUT); // Seta o echoPin como INPUT
    }
    long Distancia() { //Ler distância
        // Clears the trigPin condition
        digitalWrite(trigPin, LOW);
        delayMicroseconds(1);
        // Seta o trigPin HIGH por 10 microsegundos
        digitalWrite(trigPin, HIGH);
        delayMicroseconds(1);
        digitalWrite(trigPin, LOW);
        // Lê o echoPin, retorno da tempo da onda sonora em microsegundos
        tempo = pulseIn(echoPin, HIGH);
        // Calculating the distance
        distance = tempo * 0.034 / 2; // Velocidade da onda sonora divida por 2, ida e volta

        return distance;
    }

};

SensorDist SensorDist1, SensorDist2, SensorDist3;



// Instantiating a Fuzzy object
        Fuzzy *fuzzy = new Fuzzy();


        void setup()
        {

        Motor1.Pinout(5, 4); // Pinos motor 1
        Motor2.Pinout(6, 7); // Pinos motor 2
        Sensor1.Pinout(A0); // Pino sensor 1
        Sensor2.Pinout(A1); // Pino sensor 2
        Sensor3.Pinout(A2); // Pino sensor 3
        Sensor4.Pinout(A3); // Pino sensor 4
        Sensor5.Pinout(A4); // Pino sensor 5

        SensorDist1.Pinout(9, 12); // Pino sensor de distância central

        pinMode(ledPin, OUTPUT);

        // Set the Serial output
        //Serial.begin(9600);
        // Set a random seed
        //randomSeed(analogRead(0));

        // FuzzyInput
        FuzzyInput *Distancia = new FuzzyInput(1);

        FuzzySet *MuitoPerto = new FuzzySet(2, 4, 4, 6);
        Distancia->addFuzzySet(MuitoPerto);
        FuzzySet *Perto = new FuzzySet(5, 10, 10, 15);
        Distancia->addFuzzySet(Perto);
        FuzzySet *Intermediario = new FuzzySet(10, 20, 20, 25);
        Distancia->addFuzzySet(Intermediario);
        FuzzySet *Longe = new FuzzySet(24, 30, 30, 35);
        Distancia->addFuzzySet(Longe);
        FuzzySet *MuitoLonge = new FuzzySet(34, 50, 50, 60);
        Distancia->addFuzzySet(MuitoLonge);
        FuzzySet *Distante = new FuzzySet(59, 100, 100, 700);
        Distancia->addFuzzySet(Distante);

        fuzzy->addFuzzyInput(Distancia);

        // FuzzyInput
        FuzzyInput *VelRelInput = new FuzzyInput(2);

        FuzzySet *VelRelMuitoBaixa = new FuzzySet(10, 15, 15, 20);
        VelRelInput->addFuzzySet(VelRelMuitoBaixa);
        FuzzySet *VelRelBaixa = new FuzzySet(19, 30, 30, 40);
        VelRelInput->addFuzzySet(VelRelBaixa);
        FuzzySet *VelRelMedia = new FuzzySet(39, 50, 50, 60);
        VelRelInput->addFuzzySet(VelRelMedia);
        FuzzySet *VelRelAlta = new FuzzySet(59, 80, 80, 100);
        VelRelInput->addFuzzySet(VelRelAlta);
        FuzzySet *VelRelMuitoAlta = new FuzzySet(99, 110, 110, 140);
        VelRelInput->addFuzzySet(VelRelMuitoAlta);


        fuzzy->addFuzzyInput(VelRelInput);

        // FuzzyOutput
        FuzzyOutput *VelCar01 = new FuzzyOutput(1);

        FuzzySet *VelCar01MuitoBaixa = new FuzzySet(10, 15, 20, 35);
        VelCar01->addFuzzySet(VelCar01MuitoBaixa);
        FuzzySet *VelCar01Baixa = new FuzzySet(34, 45, 45, 60);
        VelCar01->addFuzzySet(VelCar01Baixa);
        FuzzySet *VelCar01Media = new FuzzySet(59, 65, 65, 80);
        VelCar01->addFuzzySet(VelCar01Media);
        FuzzySet *VelCar01Alta = new FuzzySet(79, 130, 130, 160);
        VelCar01->addFuzzySet(VelCar01Alta);

        fuzzy->addFuzzyOutput(VelCar01);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoPertoAndVelRelMuitoBaixa = new FuzzyRuleAntecedent();
        ifMuitoPertoAndVelRelMuitoBaixa->joinWithAND(MuitoPerto, VelRelMuitoBaixa);
        FuzzyRuleConsequent *thenVelCar01MuitoBaixa1 = new FuzzyRuleConsequent();
        thenVelCar01MuitoBaixa1->addOutput(VelCar01MuitoBaixa);
        FuzzyRule *fuzzyRule1 = new FuzzyRule(1, ifMuitoPertoAndVelRelMuitoBaixa, thenVelCar01MuitoBaixa1);
        fuzzy->addFuzzyRule(fuzzyRule1);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifPertoAndVelRelMuitoBaixa = new FuzzyRuleAntecedent();
        ifPertoAndVelRelMuitoBaixa->joinWithAND(Perto, VelRelMuitoBaixa);
        FuzzyRuleConsequent *thenVelCar01MuitoBaixa2 = new FuzzyRuleConsequent();
        thenVelCar01MuitoBaixa2->addOutput(VelCar01MuitoBaixa);
        FuzzyRule *fuzzyRule2 = new FuzzyRule(2, ifPertoAndVelRelMuitoBaixa, thenVelCar01MuitoBaixa2);
        fuzzy->addFuzzyRule(fuzzyRule2);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifIntermediarioAndVelRelMuitoBaixa = new FuzzyRuleAntecedent();
        ifIntermediarioAndVelRelMuitoBaixa->joinWithAND(Intermediario, VelRelMuitoBaixa);
        FuzzyRuleConsequent *thenVelCar01Baixa3 = new FuzzyRuleConsequent();
        thenVelCar01Baixa3->addOutput(VelCar01Baixa);
        FuzzyRule *fuzzyRule3 = new FuzzyRule(3, ifIntermediarioAndVelRelMuitoBaixa, thenVelCar01Baixa3);
        fuzzy->addFuzzyRule(fuzzyRule3);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifLongeAndVelRelMedia = new FuzzyRuleAntecedent();
        ifLongeAndVelRelMedia->joinWithAND(Longe, VelRelMedia);
        FuzzyRuleConsequent *thenVelCar01Media4 = new FuzzyRuleConsequent();
        thenVelCar01Media4->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule4 = new FuzzyRule(4, ifLongeAndVelRelMedia, thenVelCar01Media4);
        fuzzy->addFuzzyRule(fuzzyRule4);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoLongeAndVelRelMuitoBaixa = new FuzzyRuleAntecedent();
        ifMuitoLongeAndVelRelMuitoBaixa->joinWithAND(MuitoLonge, VelRelMuitoBaixa);
        FuzzyRuleConsequent *thenVelCar01MuitoAlta5 = new FuzzyRuleConsequent();
        thenVelCar01MuitoAlta5->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule5 = new FuzzyRule(5, ifMuitoLongeAndVelRelMuitoBaixa, thenVelCar01MuitoAlta5);
        fuzzy->addFuzzyRule(fuzzyRule5);
//
        // Building FuzzyRule
        FuzzyRuleAntecedent *ifDistanteAndVelRelMuitoBaixa = new FuzzyRuleAntecedent();
        ifDistanteAndVelRelMuitoBaixa->joinWithAND(Distante, VelRelMuitoBaixa);
        FuzzyRuleConsequent *thenVelCar01Alta6 = new FuzzyRuleConsequent();
        thenVelCar01Alta6->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule6 = new FuzzyRule(6, ifDistanteAndVelRelMuitoBaixa, thenVelCar01Alta6);
        fuzzy->addFuzzyRule(fuzzyRule6);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoPertoAndVelRelBaixa = new FuzzyRuleAntecedent();
        ifMuitoPertoAndVelRelBaixa->joinWithAND(MuitoPerto, VelRelBaixa);
        FuzzyRuleConsequent *thenVelCar01Baixa7 = new FuzzyRuleConsequent();
        thenVelCar01Baixa7->addOutput(VelCar01Baixa);
        FuzzyRule *fuzzyRule7 = new FuzzyRule(7, ifMuitoPertoAndVelRelBaixa, thenVelCar01Baixa7);
        fuzzy->addFuzzyRule(fuzzyRule7);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifPertoAndVelRelBaixa = new FuzzyRuleAntecedent();
        ifPertoAndVelRelBaixa->joinWithAND(Perto, VelRelBaixa);
        FuzzyRuleConsequent *thenVelCar01Media8 = new FuzzyRuleConsequent();
        thenVelCar01Media8->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule8 = new FuzzyRule(8, ifPertoAndVelRelBaixa, thenVelCar01Media8);
        fuzzy->addFuzzyRule(fuzzyRule8);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifIntermediarioAndVelRelBaixa = new FuzzyRuleAntecedent();
        ifIntermediarioAndVelRelBaixa->joinWithAND(Intermediario, VelRelBaixa);
        FuzzyRuleConsequent *thenVelCar01Media9 = new FuzzyRuleConsequent();
        thenVelCar01Media9->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule9 = new FuzzyRule(9, ifIntermediarioAndVelRelBaixa, thenVelCar01Media9);
        fuzzy->addFuzzyRule(fuzzyRule9);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifLongeAndVelRelBaixa = new FuzzyRuleAntecedent();
        ifLongeAndVelRelBaixa->joinWithAND(Longe, VelRelBaixa);
        FuzzyRuleConsequent *thenVelCar01Media10 = new FuzzyRuleConsequent();
        thenVelCar01Media10->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule10 = new FuzzyRule(10, ifLongeAndVelRelBaixa, thenVelCar01Media10);
        fuzzy->addFuzzyRule(fuzzyRule10);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoLongeAndVelRelBaixa = new FuzzyRuleAntecedent();
        ifMuitoLongeAndVelRelBaixa->joinWithAND(MuitoLonge, VelRelBaixa);
        FuzzyRuleConsequent *thenVelCar01Alta11 = new FuzzyRuleConsequent();
        thenVelCar01Alta11->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule11 = new FuzzyRule(11, ifMuitoLongeAndVelRelBaixa, thenVelCar01Alta11);
        fuzzy->addFuzzyRule(fuzzyRule11);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifDistanteAndVelRelBaixa = new FuzzyRuleAntecedent();
        ifDistanteAndVelRelBaixa->joinWithAND(Distante, VelRelBaixa);
        FuzzyRuleConsequent *thenVelCar01Alta12 = new FuzzyRuleConsequent();
        thenVelCar01Alta12->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule12 = new FuzzyRule(12, ifDistanteAndVelRelBaixa, thenVelCar01Alta12);
        fuzzy->addFuzzyRule(fuzzyRule12);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoPertoAndVelRelVelRelMedia = new FuzzyRuleAntecedent();
        ifMuitoPertoAndVelRelVelRelMedia->joinWithAND(MuitoPerto, VelRelMedia);
        FuzzyRuleConsequent *thenVelCar01Media13 = new FuzzyRuleConsequent();
        thenVelCar01Media13->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule13 = new FuzzyRule(13, ifMuitoPertoAndVelRelVelRelMedia, thenVelCar01Media13);
        fuzzy->addFuzzyRule(fuzzyRule13);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifPertoAndVelRelMedia = new FuzzyRuleAntecedent();
        ifPertoAndVelRelMedia->joinWithAND(Perto, VelRelMedia);
        FuzzyRuleConsequent *thenVelCar01Media14 = new FuzzyRuleConsequent();
        thenVelCar01Media14->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule14 = new FuzzyRule(14, ifPertoAndVelRelMedia, thenVelCar01Media14);
        fuzzy->addFuzzyRule(fuzzyRule14);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifIntermediarioAndVelRelMedia = new FuzzyRuleAntecedent();
        ifIntermediarioAndVelRelMedia->joinWithAND(Intermediario, VelRelMedia);
        FuzzyRuleConsequent *thenVelCar01Media15 = new FuzzyRuleConsequent();
        thenVelCar01Media15->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule15 = new FuzzyRule(15, ifIntermediarioAndVelRelMedia, thenVelCar01Media15);
        fuzzy->addFuzzyRule(fuzzyRule15);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifLongeHighAndVelRelMedia = new FuzzyRuleAntecedent();
        ifLongeHighAndVelRelMedia->joinWithAND(Longe, VelRelMedia);
        FuzzyRuleConsequent *thenVelCar01Alta16 = new FuzzyRuleConsequent();
        thenVelCar01Alta16->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule16 = new FuzzyRule(16, ifLongeHighAndVelRelMedia, thenVelCar01Alta16);
        fuzzy->addFuzzyRule(fuzzyRule16);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoLongeAndVelRelMedia = new FuzzyRuleAntecedent();
        ifMuitoLongeAndVelRelMedia->joinWithAND(MuitoLonge, VelRelMedia);
        FuzzyRuleConsequent *thenVelCar01Alta17 = new FuzzyRuleConsequent();
        thenVelCar01Alta17->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule17 = new FuzzyRule(17, ifMuitoLongeAndVelRelMedia, thenVelCar01Alta17);
        fuzzy->addFuzzyRule(fuzzyRule17);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifDistanteAndVelRelMedia = new FuzzyRuleAntecedent();
        ifDistanteAndVelRelMedia->joinWithAND(Distante, VelRelMedia);
        FuzzyRuleConsequent *VelCar01Alta18 = new FuzzyRuleConsequent();
        VelCar01Alta18->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule18 = new FuzzyRule(18, ifDistanteAndVelRelMedia, VelCar01Alta18);
        fuzzy->addFuzzyRule(fuzzyRule18);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoPertoAndVelRelAlta = new FuzzyRuleAntecedent();
        ifMuitoPertoAndVelRelAlta->joinWithAND(MuitoPerto, VelRelAlta);
        FuzzyRuleConsequent *thenVelCar01Baixa19 = new FuzzyRuleConsequent();
        thenVelCar01Baixa19->addOutput(VelCar01Baixa);
        FuzzyRule *fuzzyRule19 = new FuzzyRule(19, ifMuitoPertoAndVelRelAlta, thenVelCar01Baixa19);
        fuzzy->addFuzzyRule(fuzzyRule19);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifPertoAndVelRelAlta = new FuzzyRuleAntecedent();
        ifPertoAndVelRelAlta->joinWithAND(Perto, VelRelAlta);
        FuzzyRuleConsequent *thenVelCar01Baixa20 = new FuzzyRuleConsequent();
        thenVelCar01Baixa20->addOutput(VelCar01Baixa);
        FuzzyRule *fuzzyRule20 = new FuzzyRule(20, ifPertoAndVelRelAlta, thenVelCar01Baixa20);
        fuzzy->addFuzzyRule(fuzzyRule20);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifIntermediarioAndVelRelAlta = new FuzzyRuleAntecedent();
        ifIntermediarioAndVelRelAlta->joinWithAND(Intermediario, VelRelAlta);
        FuzzyRuleConsequent *thenVelCar01Media21 = new FuzzyRuleConsequent();
        thenVelCar01Media21->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule21 = new FuzzyRule(21, ifIntermediarioAndVelRelAlta, thenVelCar01Media21);
        fuzzy->addFuzzyRule(fuzzyRule21);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifLongeAndVelRelAlta = new FuzzyRuleAntecedent();
        ifLongeAndVelRelAlta->joinWithAND(Longe, VelRelAlta);
        FuzzyRuleConsequent *thenVelCar01Media22 = new FuzzyRuleConsequent();
        thenVelCar01Media22->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule22 = new FuzzyRule(22, ifLongeAndVelRelAlta, thenVelCar01Media22);
        fuzzy->addFuzzyRule(fuzzyRule22);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoLongeAndVelRelAlta = new FuzzyRuleAntecedent();
        ifMuitoLongeAndVelRelAlta->joinWithAND(MuitoLonge, VelRelAlta);
        FuzzyRuleConsequent *thenVelCar01Alta23 = new FuzzyRuleConsequent();
        thenVelCar01Alta23->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule23 = new FuzzyRule(23, ifMuitoLongeAndVelRelAlta, thenVelCar01Alta23);
        fuzzy->addFuzzyRule(fuzzyRule23);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifDistanteAndVelRelAlta = new FuzzyRuleAntecedent();
        ifDistanteAndVelRelAlta->joinWithAND(Distante, VelRelAlta);
        FuzzyRuleConsequent *thenVelCar01Alta24 = new FuzzyRuleConsequent();
        thenVelCar01Alta24->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule24 = new FuzzyRule(24, ifDistanteAndVelRelAlta, thenVelCar01Alta24);
        fuzzy->addFuzzyRule(fuzzyRule24);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoPertoAndVelRelMuitoAlta = new FuzzyRuleAntecedent();
        ifMuitoPertoAndVelRelMuitoAlta->joinWithAND(MuitoPerto, VelRelMuitoAlta);
        FuzzyRuleConsequent *thenVelCar01Baixa25 = new FuzzyRuleConsequent();
        thenVelCar01Baixa25->addOutput(VelCar01Baixa);
        FuzzyRule *fuzzyRule25 = new FuzzyRule(25, ifMuitoPertoAndVelRelMuitoAlta, thenVelCar01Baixa25);
        fuzzy->addFuzzyRule(fuzzyRule25);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifPertoAndVelRelMuitoAlta = new FuzzyRuleAntecedent();
        ifPertoAndVelRelMuitoAlta->joinWithAND(Perto, VelRelMuitoAlta);
        FuzzyRuleConsequent *thenVelCar01Baixa26 = new FuzzyRuleConsequent();
        thenVelCar01Baixa26->addOutput(VelCar01Baixa);
        FuzzyRule *fuzzyRule26 = new FuzzyRule(26, ifPertoAndVelRelMuitoAlta, thenVelCar01Baixa26);
        fuzzy->addFuzzyRule(fuzzyRule26);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifIntermediarioAndVelRelMuitoAlta = new FuzzyRuleAntecedent();
        ifIntermediarioAndVelRelMuitoAlta->joinWithAND(Intermediario, VelRelMuitoAlta);
        FuzzyRuleConsequent *thenVelCar01Media27 = new FuzzyRuleConsequent();
        thenVelCar01Media27->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule27 = new FuzzyRule(27, ifIntermediarioAndVelRelMuitoAlta, thenVelCar01Media27);
        fuzzy->addFuzzyRule(fuzzyRule27);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifLongeAndVelRelMuitoAlta = new FuzzyRuleAntecedent();
        ifLongeAndVelRelMuitoAlta->joinWithAND(Longe, VelRelMuitoAlta);
        FuzzyRuleConsequent *thenVelCar01Media28 = new FuzzyRuleConsequent();
        thenVelCar01Media28->addOutput(VelCar01Media);
        FuzzyRule *fuzzyRule28 = new FuzzyRule(28, ifLongeAndVelRelMuitoAlta, thenVelCar01Media28);
        fuzzy->addFuzzyRule(fuzzyRule28);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifMuitoLongeAndVelRelMuitoAlta = new FuzzyRuleAntecedent();
        ifMuitoLongeAndVelRelMuitoAlta->joinWithAND(MuitoLonge, VelRelMuitoAlta);
        FuzzyRuleConsequent *thenVelCar01Alta29 = new FuzzyRuleConsequent();
        thenVelCar01Alta29->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule29 = new FuzzyRule(29, ifMuitoLongeAndVelRelMuitoAlta, thenVelCar01Alta29);
        fuzzy->addFuzzyRule(fuzzyRule29);

        // Building FuzzyRule
        FuzzyRuleAntecedent *ifDistanteAndVelRelMuitoAlta = new FuzzyRuleAntecedent();
        ifDistanteAndVelRelMuitoAlta->joinWithAND(Distante, VelRelMuitoAlta);
        FuzzyRuleConsequent *thenVelCar01Alta30 = new FuzzyRuleConsequent();
        thenVelCar01Alta30->addOutput(VelCar01Alta);
        FuzzyRule *fuzzyRule30 = new FuzzyRule(30, ifDistanteAndVelRelMuitoAlta, thenVelCar01Alta30);
        fuzzy->addFuzzyRule(fuzzyRule30);

        //Initialize the software serial
        bluetooth.begin(38400);

        Serial.begin(38400);
        delay(100);

        }

        void loop()
        {


        int dist = SensorDist1.Distancia();
        int sns_1 = Sensor1.Ler();
        int sns_2 = Sensor2.Ler();
        int sns_3 = Sensor3.Ler();
        int sns_4 = Sensor4.Ler();
        int sns_5 = Sensor5.Ler();



        tempo = millis();
//    Serial.print("Tempo: ");
//    Serial.println(tempo);
//    Serial.print("Distancia: ");
//    Serial.println(dist);
//
        if(inicio == 0){
        distInicial = dist;
        distFinal = dist;
        tempoInicial = tempo;
        tempoFinal = tempo;
        tempoFinal = millis();
        inicio = 1;
        }

        else {
        tempoFinal = tempo;
        if ((tempoFinal - tempoInicial) >= 3000){
        distFinal = dist;
        double difTempo = ((tempoFinal-tempoInicial)/1000);
//        Serial.print("Diferenca: ");
//        Serial.println(difTempo);
//        Serial.print("Distancia inicial: ");
//        Serial.println(distInicial);
//        Serial.print("Distancia final: ");
//        Serial.println(distFinal);
        velcar = (distFinal-distInicial)/difTempo;
        inicio = 0;


//        Serial.print("Velocidade: ");
//        Serial.println(velcar);

        }
        }

//  Serial.print(" Result: ");
//  Serial.println(output1);
//  Serial.println("=================================================================");
        // delay(1000);

        if (bluetooth.available() > 0) {
        char txt = bluetooth.read();
        bluetooth.print(txt);
        if (txt == 'A') {
        if (velocidade < 140) {
        velPadrao = velPadrao + 1;
        }
        } else if (txt == 'D') {
        if (velPadrao > 0) {
        velPadrao = velPadrao - 1;
        }
        estado = 1;
        } else {
        //Serial.print(txt);
        texto += txt; //Variável para armazenar todos os dados
        if (txt == '\n') { //Se o dado atual for um pulador de linha (\n)
        texto.trim(); //Remove o \n para comparar o texto
        int vel = texto.toInt();
        //Serial.println(vel);
        if (vel > 10 && vel <100){
        velBlue = (vel/100)*velPadrao;
        estado = 1;
        }

        texto = ""; //Limpa o comando para futuras leituras

        }
        }
        }

//    Serial.println(velPadrao);

        //  Serial.print("Distancia: ");
        //  Serial.print(dist);
        //  Serial.print(", Velocidade: ");
        //  Serial.print(input2);



//
        int input = dist;
        int input1 = velcar;
        if (input < 100) {
        fuzzy->setInput(1, input);
        fuzzy->setInput(2, input1);
        //Running the Fuzzification
        fuzzy->fuzzify();
        //Running the Defuzzification
        float output = fuzzy->defuzzify(1);
        velFuzzy = output;
        estado = 2;
//      //Printing something
//      Serial.println("Result: ");
//      Serial.print("\t\t\tSpeed: ");
//      Serial.println(output);
        }


        if ((sns_1 == 1) && (sns_5 == 0)) { // Se detectar na extremidade das faixas duas cores brancas
        aux = true;
        } else if ((sns_1 == 0) && (sns_5 == 1)) {
        aux = false;
        }

        if (aux == true) {
        estado = 3;
        }
//
//    Serial.println(velPadrao);
//    Serial.println(velocidade);

//    if (bluetooth.available() > 0) {
//      bluetooth.print(velocidade);
//    }


        Serial.print("Estado: ");
        Serial.println(estado);

        switch (estado) {
        case 0:
        //digitalWrite(ledPin, LOW);
        velocidade = velPadrao;
        break;
        case 1:
        //digitalWrite(ledPin, LOW);
        velocidade = velBlue;
        break;
        case 2:
        //digitalWrite(ledPin, HIGH);
        velocidade = velFuzzy;
        break;
        case 3:
        //digitalWrite(ledPin, LOW);
        velocidade = velCurva;
        break;
default:
        //digitalWrite(ledPin, LOW);
        velocidade = velPadrao;
        break;
        }

        Motor1.Velocidade(velocidade); // A velocidade do motor pode variar de 0 a 255, onde 255 é a velocidade máxima.
        Motor2.Velocidade(velocidade);
//

        Motor1.Andar();
        Motor2.Andar();

        if ((dist > 15) && (dist < 1000)) {
        if ((sns_2 == 0) && (sns_4 == 0)) { // Se detectar na extremidade das faixas duas cores brancas
        Motor1.Andar();
        Motor2.Andar();
        }
        if ((sns_2 == 1) && (sns_4 == 0)) { // Se detectar um lado preto e o outro branco
        Motor1.Parar();
        Motor2.Andar();
        }
        if ((sns_2 == 0) && (sns_4 == 1)) { // Se detectar um lado branco e o outro preto
        Motor1.Andar();
        Motor2.Parar();
        }
        } else if (dist > 1000) {
        if ((sns_2 == 0) && (sns_4 == 0)) { // Se detectar na extremidade das faixas duas cores brancas
        Motor1.Andar();
        Motor2.Andar();
        }
        if ((sns_2 == 1) && (sns_4 == 0)) { // Se detectar um lado preto e o outro branco
        Motor1.Parar();
        Motor2.Andar();
        }
        if ((sns_2 == 0) && (sns_4 == 1)) { // Se detectar um lado branco e o outro preto
        Motor1.Andar();
        Motor2.Parar();
        }
        } else {
        Motor1.Parar();
        Motor2.Parar();
        }
        }