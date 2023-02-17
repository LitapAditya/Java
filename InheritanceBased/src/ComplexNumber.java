public class ComplexNumber
{
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal()
    {
        return real;
    }

    public double getImaginary()
    {
        return imaginary;
    }

    public String add(double real, double imaginary)
    {
        this.real = addReal(real);
        this.imaginary = addImaginary(imaginary);
        return this.real + " " + this.imaginary + "i";
    }

    public String add(ComplexNumber complexNumber)
    {
        this.real = addReal(complexNumber.real);
        this.imaginary = addImaginary(complexNumber.imaginary);
        return this.real + " " + this.imaginary + "i";
    }

    private double addReal(double real)
    {
        return this.real + real;
    }

    private double addImaginary(double imaginary)
    {
        return this.imaginary + imaginary;
    }

    public String subtract(double real, double imaginary)
    {
        this.real -= real;
        this.imaginary -= imaginary;
        return this.real + " " + this.imaginary + "i";
    }

    public String subtract(ComplexNumber complexNumber)
    {
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
        return this.real + " " + this.imaginary + "i";
    }
}