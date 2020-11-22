package co.edu.eci.ieti.android.network.service;
import co.edu.eci.ieti.android.network.data.Task;
import java.util.List;
import retrofit2.http.GET;
public interface TaskService{

    @GET
    List <Task> getAllTasks();
}