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

* **Przykład użycia:**

```
http://localhost:8081/api/ppkwu/lab3/TESt0912./json
```

`wejście:`

`wyjście:`