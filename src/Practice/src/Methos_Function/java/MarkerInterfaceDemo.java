package Methos_Function.java;

// Marker interface (no methods)
interface PermissionAllowed { }

// Class that implements the marker interface
class AdminUser implements PermissionAllowed {
    // some properties or methods can be here
}

// Class that does NOT implement the marker interface
class GuestUser {
    // some properties or methods can be here
}

// Main class
public class MarkerInterfaceDemo {

    // Method to perform a special operation
    static void performSpecialOperation(Object obj) throws Exception {
        if (obj instanceof PermissionAllowed) {
            System.out.println("✅ Special operation performed successfully for: " + obj.getClass().getSimpleName());
        } else {
            throw new Exception("❌ Permission Denied! " + obj.getClass().getSimpleName() + " is not allowed to perform this operation.");
        }
    }

    public static void main(String[] args) {
        try {
            AdminUser admin = new AdminUser();
            GuestUser guest = new GuestUser();

            performSpecialOperation(admin);  // Allowed
            performSpecialOperation(guest);  // Throws Exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
