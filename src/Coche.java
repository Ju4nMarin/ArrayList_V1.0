
public class Coche {

    private String Color;
    private String Marca;
    private String dni;
    private String Modelo;
    private float NumC;
    private int NumP;
    
    
    
     public Coche() {
        
    }

    public Coche(String Color, String Marca, String dni, String Modelo, float NumC, int NumP) {
        this.Color = Color;
        this.Marca = Marca;
        this.dni = dni;
        this.Modelo = Modelo;
        this.NumC = NumC;
        this.NumP = NumP;
    }

   

    public String getColor() {
        return Color;
    }

    public String getMarca() {
        return Marca;
    }

    public String getDni() {
        return dni;
    }

    public String getModelo() {
        return Modelo;
    }

    public float getNumC() {
        return NumC;
    }

    public int getNumP() {
        return NumP;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setNumC(float NumC) {
        this.NumC = NumC;
    }

    public void setNumP(int NumP) {
        this.NumP = NumP;
    }
    
    public String getGenerarDni() {
        int NumRandom = ((int) Math.floor(Math.random() * (1000)));
        int NumRandom2 = ((int) Math.floor(Math.random() * (1000)));
        int LetRandom = 0;
        int LetRandom2 = 0;
        char lDni = getLetra(LetRandom);
        char lDni2 = getLetra(LetRandom2);

        return dni = Integer.toString(NumRandom) + lDni + (NumRandom2) + lDni2;
    }

    public char getLetra(int LetRandom) {
        int Letra = ((int) Math.floor(Math.random() * (26)));
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        return letras[Letra];
    }

}
