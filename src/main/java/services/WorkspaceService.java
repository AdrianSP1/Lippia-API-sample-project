package services;


import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.Response;


public class WorkspaceService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, WorkspacesResponse[].class,setParams());
    }


    }


