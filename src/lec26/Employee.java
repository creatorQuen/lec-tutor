package lec26;

public abstract class Employee implements ITaskHandler {
    private final ITaskProgressCallBack callback;
    private final String name;
    private final Task.Status taskStatus;

    protected Employee(ITaskProgressCallBack callback, String name, Task.Status taskStatus) {
        this.callback = callback;
        this.name = name;
        this.taskStatus = taskStatus;
    }

    public boolean doTask(Task task) {
        boolean canHandle = taskStatus == task.getStatus();
        if (canHandle) {
            System.out.println(getClass().getSimpleName() + " " + name
                    + " is doing task " + getDetails(task));
            callback.updateTask(getTaskWhenDone(task));
        }
        return canHandle;
    }

    public boolean canHandleTask(Task task) {
        return taskStatus == task.getStatus();
    }

    public Task.Status getTaskStatus() {
        return taskStatus;
    }

    protected abstract Task getTaskWhenDone(Task task);

    protected abstract String getDetails(Task task);
}
