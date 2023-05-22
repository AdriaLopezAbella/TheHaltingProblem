# TheHaltingProblem

Enlace al repositorio: https://github.com/AdriaLopezAbella/TheHaltingProblem.git

Cabe decir de antemano que parte de mi proyecto ha sido realizado en colaboración con otros compañeros. 
No obstante si que he entendido como funcionan los patrones que he usado y para mostarlo voy a hacer un pequeño resumen sobre el proyecto.

Para comenzar hemos creado una interfaz Maquinas la cual hemos implementado en una clase abstracta que va a ser extendida a nuestras maquinas concretas
Posteriormente hemos crado una interfaz Datos que va a ser implemnetado en los datos propios para cada maquina concreta.
Luego hemos pasado a diseñar los Factories (usando Factory Method), los cuales se van a encargar de crear los diseños establecidos anteriormente.
Para continuar hemos utilizado el patron estructural Decorator para poder implementar en un futuro nuesvas funcionalidades a las maquinas.
Y finalmente hemos usado el patrón de Comportamiento Observer para poder visualizar el estado que tenia 
la máquina una vez se hubiese realizado todo el proceso de introducir los datos de la misma.

PlantUML:

@startuml

Interface Maquinas  
Abstract MaquinaAbstracta  
class MaquinaA  
class MaquinaH  

Abstract DecoratorMaquina  
class DecoratorMaquinaA  
class DecoratorMaquinaH  

abstract FactoryMaquina  
class FactoryMaquinaA  
class FactoryMaquinaH  

Interface Datos  
class DatosA  
class DatosH  

Interface PatronObserver  
class EstadoFinalObserver  

Maquinas <-- MaquinaAbstracta  
MaquinaAbstracta <-- MaquinaA  
MaquinaAbstracta <-- MaquinaH  

DecoratorMaquina <-- DecoratorMaquinaA  
DecoratorMaquina <-- DecoratorMaquinaH  

FactoryMaquina <-- FactoryMaquinaA  
FactoryMaquina <-- FactoryMaquinaH  

Datos <-- DatosA  
Datos <-- DatosH  

PatronObserver <-- EstadoFinalObserver  

@enduml


![UML](http://www.plantuml.com/plantuml/png/XP91oeCm48NtSmelu0t-XG5_iOlINc6CAHHiGcV6Gc_V419hejITyzxd0pziM91aVam09ok6RgXDTSRdVBV8e0OMGYqfIJU2df1vYVEpX--BhT6EK1p5Bf9bhBPvci8qrQ7snJiVoaErc_RhRslzEaSiFAlraQ5N57BsCh2Xbw68_RFWw3e_EoqD967LNrrlNPL1HlriUu3IIAWt-WwnD9UP2LIfy1ZnCq5MgAB38l18RYzKk-uQOqV__tq0)
