// Encapsulated Marks class in Java
class Marks2 {
    // Private data members
    private int mark1, mark2, mark3;

    // Setter methods (with validation)
    public void setMark1(int mark1) {
        if (isValidMark(mark1)) {
            this.mark1 = mark1;
        } else {
            System.out.println("Invalid mark! Setting mark1 to 0.");
            this.mark1 = 0;
        }
    }

    public void setMark2(int mark2) {
        if (isValidMark(mark2)) {
            this.mark2 = mark2;
        } else {
            System.out.println("Invalid mark! Setting mark2 to 0.");
            this.mark2 = 0;
        }
    }

    public void setMark3(int mark3) {
        if (isValidMark(mark3)) {
            this.mark3 = mark3;
        } else {
            System.out.println("Invalid mark! Setting mark3 to 0.");
            this.mark3 = 0;
        }
    }

    // Getter methods
    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    // Method to validate marks (0-100)
    private boolean isValidMark(int mark) {
        return (mark >= 0 && mark <= 100);
    }

    // Method to display marks
    public void display() {
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
    }
}

// Runner class to test Marks class
 class Marks3 {
    public static void main(String[] args) {
        // Creating object of Marks class
        Marks2 student = new Marks2();

        // Setting valid marks
        student.setMark1(85);
        student.setMark2(90);
        student.setMark3(78);

        // Displaying marks
        System.out.println("Student Marks:");
        student.display();

        System.out.println();

        // Setting invalid marks
        student.setMark1(120); // Invalid
        student.setMark2(-10); // Invalid
        student.setMark3(95);  // Valid

        // Displaying updated marks
        System.out.println("After Setting Invalid Marks:");
        student.display();
    }
}
