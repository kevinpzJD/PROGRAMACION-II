import math
class AlgebraVectorial():
    def __init__(self,a1,a2,a3):
        self._a1=a1
        self._a2=a2
        self._a3=a3
        
    def __add__(self,otrov):
       c1 = self._a1 + otrov._a1
       c2 = self._a2 + otrov._a2
       c3 = self._a3 + otrov._a3
       return AlgebraVectorial(c1, c2, c3)
   
    def __mul__(self,r):
        c1=r*self._a1
        c2=r*self._a2
        c3=r*self._a3
        return AlgebraVectorial(c1,c2,c3)
    
    def longitud(self):
        s=(self._a1)**2 + (self._a2)**2 + (self._a3)**2
        return math.sqrt(s)
    
    def normal(self):
        c=self.longitud()
        c1=self._a1/c
        c2=self._a2/c
        c3=self._a3/c
        return AlgebraVectorial(c1,c2,c3)
    
    def producto(self,otrov):
        s=(self._a1*otrov._a1)+(self._a2*otrov._a2)+(self._a3*otrov._a3)
        return s
    
    def __matmul__(self,otrov):
        s1=(self._a2*otrov._a3)-(self._a3*otrov._a2)
        s2=(self._a3*otrov._a1)-(self._a1*otrov._a3)
        s3=(self._a1*otrov._a2)-(self._a2*otrov._a1)
        return AlgebraVectorial(s1,s2,s3)
    
    def __str__(self):
        return f"({self._a1} , {self._a2} , {self._a3})"
    
a=AlgebraVectorial(1,2,3)
b=AlgebraVectorial(4,5,6)
print("a) Suma de dos vectores a y b : " ,a+b)
print("b) Multiplicacion de un escalar r por un vector a : " , a*3)
print("c) Longitud de un vector a : " , a.longitud())
print("d) Normal de un vector a: " , a.normal())
print("e) Producto escalar de a y b : " , a.producto(b))
print("f) Producto vectorial de a y b : " , a@b)


    