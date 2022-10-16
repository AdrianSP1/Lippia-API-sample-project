package ar.steps;

import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;


import static ar.validator.ProjectValidate.*;

public class ProjectSteps extends PageSteps {
    @Given("Api key no valida")
    public static void InvalidApiKey(){
        BaseService.API_KEY.set("YmM1MWE0M2EtMjVmYi00OTYxLWE3MzktMjhkM2RiNzFiNurm");
    }
    @And("workspace-id no valido")
    public static void InvalidWorkSpace(){
        BaseService.WORKSPACE.set("633f5899648048064054990z");
    }
    @And("workspace-id valido")
    public static void ValidWorkSpace(){
        BaseService.WORKSPACE.set(PropertyManager.getProperty("work-space"));
    }
    @And("workspace-id vacio")
    public static void EmptyWorkSpace(){
        BaseService.WORKSPACE.set("");
    }
    @Then("Se valida que existen proyectos")
    public static void ValidProjectId(){
        validateProjectId();
    }

    @Then("se valida el proyecto")
    public static void ValidarProject(){validaProject();}

    @Then("se valida el workspace")
    public static void ValidarWorkspace(){validaWorkspace();}

}
