package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;



public class ProjectService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, ProjectResponse[].class, setParams());
    }

public static Response post(String JsonName){
        return post(JsonName, ProjectResponse.class, setParams());
}

}
