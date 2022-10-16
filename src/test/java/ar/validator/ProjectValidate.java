package ar.validator;

import api.model.Project.ProjectResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PropertyManager;
import org.testng.Assert;


public class ProjectValidate {
    public static void  validaWorkspace(){
        WorkspacesResponse[] response= (WorkspacesResponse[])
                APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(),"El  ID es nulo");
    }
    public static void  validaProject(){
        ProjectResponse[] response= (ProjectResponse[])
                APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(),"El  ID es nulo");
    }

    public static void validateProjectId(){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(),"El campo ID es nulo");
    }




}
