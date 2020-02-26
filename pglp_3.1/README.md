1- Celà ne respecte pas SRP car la classe a plusieurs responsabilités: affichage + calculs de salaire.
2- Dès que le méthode pour calculer les salaires change, on modifie la classe
3- SRP ne sera toujours pas respecté, on ajoute même une dépendance avec les i/o.
