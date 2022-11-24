Feature: Project
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mis Proyectos
  PARA llevar un buen control de mis horas de trabajo y los proyectos en los que estoy involucrado

  @200
  Scenario Outline: Consulta Project con resultado  exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then  Se valida que existen proyectos
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |

  @401
  Scenario Outline: Consulta Project con key invalida
    Given Api key no valida
    And workspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then  se obtuvo el response esperado en <entity> con el <status>
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | ERROR | project/rq | 401   |

  @403
 Scenario Outline: Consulta Project con workspace no valido
    Given Api key no valida
    And workspace-id no valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | ERROR| project/rq | 403   |


  @404
  Scenario Outline: Consulta Project con workspace vacio
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And workspace-id vacio
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then  se obtuvo el response esperado en <entity> con el <status>
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | ERROR | project/rq | 404    |




