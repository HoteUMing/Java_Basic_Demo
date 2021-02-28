public class Test_3_Math {
    public void start() {
        double E = Math.E;
        System.out.println("E : " + E);
        //E : 2.718281828459045

        double PI = Math.PI;
        System.out.println("PI : " + PI);
        //PI : 3.141592653589793

        double abs = Math.abs(-1.00);
        System.out.println("abs(-1.00): " + abs);
        //abs(-1.00): 1.0

        double exp = Math.exp(1.00);
        System.out.println("exp(1.00): " + exp);
        //exp(1.00): 2.718281828459045

        double sqrt = Math.sqrt(4.00);
        System.out.println("sqrt(4.00): " + sqrt);
        //sqrt(4.00): 2.0

        double cbrt = Math.cbrt(-8.00);
        System.out.println("cbrt(-8.00): " + cbrt);
        //cbrt(-8.00): -2.0

        double pow = Math.pow(2.00, 3.00);
        System.out.println("pow(2.00, 3.00): " + pow);
        //pow(2.00, 3.00): 8.0

        double ceil = Math.ceil(3.50);
        System.out.println("ceil(3.50): " + ceil);
        //ceil(3.50): 4.0

        double floor = Math.floor(4.50);
        System.out.println("floor(4.50): " + floor);
        //floor(4.50): 4.0

        double rint = Math.rint(5.50);
        System.out.println("rint(5.50): " + rint);
        //rint(5.50): 6.0

        long round = Math.round(6.50);
        System.out.println("round(6.50): " + round);
        //round(6.50): 7

        double sin = Math.sin(Math.PI / 4);
        System.out.println("sin(Math.PI / 4): " + sin);
        //sin(Math.PI / 4): 0.7071067811865475

        double cos = Math.cos(Math.PI / 4);
        System.out.println("cos(Math.PI / 4): " + cos);
        //cos(Math.PI / 4): 0.7071067811865476

        double tan = Math.tan(Math.PI / 4);
        System.out.println("tan(Math.PI / 4): " + tan);
        //tan(Math.PI / 4): 0.9999999999999999

        double asin = Math.asin(1.00);
        System.out.println("asin(1.00): " + asin);
        //asin(1.00): 1.5707963267948966

        double acos = Math.acos(1.00);
        System.out.println("acos(1.00): " + acos);
        //acos(1.00): 0.0

        double atan = Math.atan(1.00);
        System.out.println("atan(1.00): " + atan);
        //atan(1.00): 0.7853981633974483

        double log = Math.log(Math.E);
        System.out.println("log(Math.E): " + log);
        //log(Math.E): 1.0

        double log10 = Math.log10(100);
        System.out.println("log10(100): " + log10);
        //log10(100): 2.0

        double max = Math.max(-7.00, 7.00);
        System.out.println("max(-7.00, 7.00): " + max);
        //max(-7.00, 7.00): 7.0

        double min = Math.min(-8.00, 8.00);
        System.out.println("min(-8.00, 8.00): " + min);
        //min(-8.00, 8.00): -8.0

        double toD = Math.toDegrees(Math.PI);
        System.out.println("toDegrees(Math.PI): " + toD);
        //toDegrees(Math.PI): 180.0

        double toR = Math.toRadians(180);
        System.out.println("toRadians(180): " + toR);
        //toRadians(180): 3.141592653589793

        double random = Math.random();
        System.out.println("random(): " + random);
        //random(): 0.5316715523775751
    }
}
