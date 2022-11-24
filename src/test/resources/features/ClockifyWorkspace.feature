Feature: Workspace
  Given Como usuario de Clockify
  And  Quiero ver las configuraciones de mi Worckspace
  And Para llevar un buen control de mis horas de trabajo y el de mis empleados
   @Workspace
  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | WORKSPACE | workspace/rq | 200    |

  @WorkspaceError
  Scenario Outline: Consulta Workspace resultado erroneo
    Given X-Api-Key invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity | jsonName     | status |
      | GET       | ERROR  | workspace/rq | 401    |







