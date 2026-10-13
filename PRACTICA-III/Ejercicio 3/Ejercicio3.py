#HERENCIA MULTIPLE
class Sensor:
    def __init__(self,id):
        self.tipo="Generico"
        self.id=id
        self.encendido=False
    
    def activar(self):
        print("sensor prendido")
    def desactivar(self):
        print("sensor desactivado")
    
class Camara(Sensor):
    def __init__(self,id,resolucion, **kwargs):
        super().__init__(id, **kwargs)
        self.tipo="camara"
        self.resolucion=resolucion
        
class SensorLuzLaser(Sensor):
    def __init__(self,id,alcance, **kwargs):
        super().__init__(id, **kwargs)
        self.tipo="Luz Laser"
        self.alcance=alcance
        
class VehiculoAutonomo(Camara,SensorLuzLaser):
    def __init__(self,id,resolucion,alcance):
        super().__init__(id=id,resolucion=resolucion,alcance=alcance)
        self.tipo="Vehiculo Autonomo"
        
    def __str__(self):
        return f"Vehiculo [ID: {self.id}, Tipo: {self.tipo}, Resolución: {self.resolucion}, Alcance: {self.alcance}m]"



#-------------
auto=VehiculoAutonomo("123456","4k",20)
print("----------informacion del vehiculo------------")
print(auto)
