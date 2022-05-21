//
//  DR - Execution plus rapide sur "xterm"
//  avec 2 commandes : (cf console output)
// $ javac -d . $(find . -type f -name '*.java')
// $ java -classpath .:target/dependency/* Main

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    System.out.println("          ***             ***");
    
    float pi1 =  3.14159265359f;
    double pi2 = 3.141592653589794;
    System.out.println("Avec un float  : " + pi1); // 7 decimals digits max
    System.out.println("Avec un double : " + pi2); // 7 + 8  = 15 Decimals
    
    System.out.println("          ***             ***");
    
    long ageTerre = 4543000000L;
    int monAge = 38;
    double maTaille = 1.73;
    double monPoids = 69.2;
    boolean suisCelibataire = true;
    
    System.out.println("La terre a " + ageTerre + " ans.");
    System.out.println("Me concernant, j'ai " + monAge + " ans.");
    System.out.println("Je mesure " + maTaille + "m, et pèse " + monPoids + "kg.");
    System.out.println("Suis-je célibataire : " + suisCelibataire + ".");
    
    System.out.println("          ***             ***");
    
    int a = 2147483647 + 1;
    int b = -2147483648 - 1;
    System.out.println("int a =  2147483647 + 1 donne : " + a);
    System.out.println("int b = -2147483648 - 1 donne : " + b);   
 
    System.out.println("          ***             ***");
    }
  }