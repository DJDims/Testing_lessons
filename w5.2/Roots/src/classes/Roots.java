package classes;

public class Roots {

    public Roots() {
    }
    
    private float discriminant(float a, float b, float c){
        return b*b - 4*a*c;
    }
    private float root1(float a, float b, float c){
        return (float) (((-b) + Math.sqrt(discriminant(a, b, c))) / 2*a);
    }
    private float root2(float a, float b, float c){
        return (float) (((-b) - Math.sqrt(discriminant(a, b, c))) / 2*a);
    }
    public float[] quadraticEquation(float a, float b, float c){
        float[] roots = new float[2];
        float root1 = root1(a, b, c);
        float root2 = root2(a, b, c);
        roots[0] = root1;
        roots[1] = root2;
        return roots;
    }
}
