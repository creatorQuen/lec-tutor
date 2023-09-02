package lec26;

import org.jetbrains.annotations.NotNull;

public class TaskFactory {

    private static final int SIZE = 10;
    private final Task[] tasks;

    public TaskFactory(){
        tasks = new Task[SIZE];
        for (int i = 0; i < SIZE; i++) {
            tasks[i] = new Task(i, Task.Status.ASSEMBLING_REQUIREMENTS,
                    "description " + i, "", "", "");
        }
    }

    @NotNull
    public Task getTask() {
        Task result = null;
        for (Task t : tasks) {
            if (t.getStatus() != Task.Status.DONE) {
                result = t;
                break;
            }
        }

        if (result == null) {
            result = tasks[0];
        }

        return  result;
    }

    public void updateTask(Task task) {
        for (int i = 0; i < SIZE; i++) {
            if (tasks[i].getId() == task.getId()) {
                tasks[i] = task;
                break;
            }
        }
    }
}
