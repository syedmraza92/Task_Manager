package raza.syed;

public class Task {
    private String title;
    private String description;
    private Person owner;
    private Boolean isCompleted;
    private Category category;

    public Task(String title, Person owner, Category category){
        this.title = title;
        this.description = "";
        this.owner = owner;
        this.isCompleted = true;
        this.category = category;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Task: %s, Description: %s, Owner: %s, Category: %s, Is completed: %b",
                title, description, owner.getFirstName(), category.toString(), isCompleted));
        return builder.toString();
    }

}
