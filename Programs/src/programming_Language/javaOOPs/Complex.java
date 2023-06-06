package programming_Language.javaOOPs;

public class Complex
{
    int real, imag;

    void print() {
        System.out.println(real + " + i"+ imag);
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void add(Complex C) {
        real += C.real;
        imag += C.imag;
    }
}