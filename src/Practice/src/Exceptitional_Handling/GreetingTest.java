package Exceptitional_Handling;

// Interface with default method
interface ThreeD {
    default void SAYHELLO() {
        System.out.println("Hello from 3D interface!");
    }
}

// EnglishGreeting class implementing ThreeD
class EnglishGreeting implements ThreeD {
    // No need to override SAYHELLO() unless custom behavior is needed
}

// SpanishGreeting class implementing ThreeD
class SpanishGreeting implements ThreeD {
    // Overriding SAYHELLO() for custom Spanish greeting
    @Override
    public void SAYHELLO() {
        System.out.println("¡Hola desde la interfaz 3D!");
    }
}

// Main class to test the implementation
public class GreetingTest {
    public static void main(String[] args) {
        ThreeD english = new EnglishGreeting();
        ThreeD spanish = new SpanishGreeting();

        english.SAYHELLO();  // Output: Hello from 3D interface!
        spanish.SAYHELLO();  // Output: ¡Hola desde la interfaz 3D!
    }
}
