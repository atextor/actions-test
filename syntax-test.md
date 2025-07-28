# test 1

$\color{Green}{\textsf{Normal, colored text}}$<br> <br>
$\color{Green}{\texttt{Normal, colored text}}$<br>
<br>
$\small\texttt{Validation errors were found:}$<br>
$\small\texttt{}$<br>
$\small\texttt{> Syntax error:}$<br>
$\small\texttt{  {\color{orange}---> Error at line 17 column 3} in {\color{blue}file:/home/me/models/org.eclipse.esmf.test/1.0.0/InvalidSyntax.ttl}}$<br>
$\small\texttt{     |}$<br>
$\small\texttt{  15 | :InvalidSyntax a samm:Aspect;}$<br>
$\small\texttt{  16 |    samm:preferredName "Test Aspect"@en}$<br>
$\small\texttt{  17 |    samm:properties () ;}$<br>
$\small\texttt{     |    {\color{orange}^ Triples not terminated by DOT}}$<br>
$\small\texttt{  18 |    samm:operations () .}$<br>
$\small\texttt{     |}$<br>

# test 2

$$
\smaller Validation errors were found: \\
\smaller \texttt{> Syntax error}
$$

# test 3

```math
\begin{array}{l}
Validation~errors~were~found:\\
\end{array}
```
```math
\begin{array}{rcl}
~ & ~ & \texttt{> Syntax~error:}\\
~ & ~ & \texttt{{\color{orange}--->\;Error\;at\;line\;17\;column\;3}\;in\;{\color{blue}file:/home/me/models/org.eclipse.esmf.test/1.0.0/InvalidSyntax.ttl}}
~ & \mid & ~\\
\texttt{15} & \mid & \texttt{:InvalidSyntax\;a\;samm:Aspect\;;}\\
\texttt{16} & \mid & \texttt{\;\;\;samm:preferredName\;"Test\;Aspect"@en\;;}\\
\end{array}
```

# test 4

<pre>
Validation errors were found:

> Syntax error:
  ---> <b>Error at line 17 column 3</b> in file:/home/me/models/org.eclipse.esmf.test/1.0.0/InvalidSyntax.ttl
     |
  15 | :InvalidSyntax a samm:Aspect ;
  16 |    samm:preferredName "Test Aspect"@en
  17 |    samm:properties () ;
     |    <b>^ Triples not terminated by DOT</b>
  18 |    samm:operations () .
     |}
</pre>
