**PPKWU lab3**
----
Rest API, które otrzymany ciąg znaków przekazuje do zadania 2 i zwraca rezultat w postaci jednego z trzech formatów:
txt ("rodzaj znaków: %d\n...", json, xml i csv).

* **SKŁADNIA**

 ``` 
ścieżkaApi/{tekst}/{format}
```

* **Parametry**

 ```
{tekst} - ciąg znaków przekazywany do API z zadania 2
{format} - wybrany format text - json, xml lub csv
 ```

* **Metoda**

```
GET
```

* **Przykład użycia JSON:**

```
http://localhost:8081/api/ppkwu/lab3/TESt0912./json
```

`wejście:`

```
TESt0912.
```

`wyjście:`

```
{"UPPER":"3","LOWER":"1","OWN":"5","DIGIT":"4","SPECIAL":"1"}
```

* **Przykład użycia XML:**

```
http://localhost:8081/api/ppkwu/lab3/TESt0912./xml
```

`wejście:`

```
TESt0912.
```

`wyjście:`

```
<StringHelper>
<upperCounter>3</upperCounter>
<lowerCounter>1</lowerCounter>
<digitCounter>4</digitCounter>
<specialCounter>1</specialCounter>
<ownCombinationCounter>5</ownCombinationCounter>
</StringHelper>
```

* **Przykład użycia TXT:**

```
http://localhost:8081/api/ppkwu/lab3/TESt0912./txt
```

`wejście:`

```
TESt0912.
```

`wyjście:`

```
UPPER: 3 LOWER: 1 DIGIT: 4 SPECIAL: 1 OWN: 5
```

* **Przykład użycia CSV:**

```
http://localhost:8081/api/ppkwu/lab3/TESt0912./csv
```

`wejście:`

```
TESt0912.
```

`wyjście:`

```
UPPER,LOWER,OWN,DIGIT,SPECIAL 3,1,5,4,1
```