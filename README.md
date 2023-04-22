**Nom :** Antunes Celia / Yanis Verdier   
**Groupe :** B1 équipe 08   
**Année :** 2023   
**IUT Le Havre - Cours GIT**   

# Compte-rendu TP3 Travailler en équipe sur un depôt github distant


### 1. Inviter des collaborateurs dans un dépôt personnel

***

Le but de ce TP est de commencer à utiliser le git pour travailler en équipe, j'ai donc pris le rôle de *Athos* ainsi que Maximilien et Yanis a le rôle de *Porthos*.

*Athos* va créer un nouveau dépôt sur github *tp3* comme nous l'avons fait dans les TP précédents.

Une fois cela fait, nous cliquons sur **Settings** puis sur **Manage access** et sur **Invite a collaborator**, afin d'inviter *Porthos* sur github grâce à son nom d'utilisateur. Il doit ensuite, aller  dans sa boîte email pour recevoir l’invitation et à l'accepter.

Chacun de nous allons faire un clone du projet en se plaçant dans le répertoire *courseGIT*, une fois dedans, mettre **git clone git@github.com:<utilisateur_de_athos>/tp3.git** en remplaçant par notre nom d'utilisateur.

Puis pour terminer cette étape, nous avons réaliser un exercice, *Pothos* doit mettre à jour tous les fichiers avec ceux du répertoire *tp2* dans *tp3*. Pour que par la suite, *Athos* puisse faire **git pull** depuis notre *tp3* afin de synchroniser les changements, puis vérifier si tout le monde a la même chose.

### 2. Développement d’un projet java en équipe

***

Reprenons maintenant, notre projet Crypto-monnaie que nous allons améliorer avec un marché et différents portefeuilles.

*Athos* a donc télécharger les dossier *.java* mit à disposition, et les a mit dans le répertoire *tp3/src*, et les valider dans le dépôt local et distant. *Porthos* vérifie d'avoir la dernière version du dépôt distant.

Les fichiers *.java* ont été séparé entre les équipes afin qu'ils puissent être complétés. Afin que le code fonctionne, il ne doit pas y avoir d'erreurs à la compilation et le *TestCryptoMarche* doit renvoyer que des *FAIL*.

Chacun ayant fini de créer les fonctions sur leurs fichier *.java*, nous allons synchronisé nos modifications avec le dépôt local et distant.

Puis, afin de finir cette étape, nous allons réaliser l'exercice, qui consiste a compiler et lancer le test java *TestCryptoMarche*, le résultat, cette fois ci doit renvoyer *OK* partout.

### 3. Gérer des nouvelles fonctionnalités à l’aide des branches

***

#### 3.1 Tester le concept de branche avec un exemple simple

Nous lançons chacun notre propre crypto-monnaie, la **AthosCoin** et la **PorthosCoin**.

Nous allons donc pour ce faire, créer une nouvelle branche. Nous allons tester dans une branche séparée, vérifier si cela fonctionne puis l’intégrer dans la branche principale. Nous pouvons voir toutes les branches déjà existantes avec **git branch** et en voir le contenu **tree**. Et pouvons également, voir les modifications apportées avec **git log --graph --oneline --all --decorate --topo-order**.

Créons une nouvelle branche **test** avec l'aide de la commande **git checkout -b test** ( le *-b* permet la création et le *checkout* le changement de branche ).

Commençons par créer un nouveau fichier *test.txt* avec **touch test.txt** ou pour windows **type nul >> "test.txt"** et valider les changements, avec **add** et **commit**.

Si nous changeons le *README.md* dans la branche principale, et que nous faisons **log**, nous voyons qu'une fourchette dans le code vient d'être produite.

#### 3.2 Fusionner la branche de test dans la branche principale

***

Nous voulons maintenant fusionner nos branches. Pour cela il faut aller dans notre branche principale **git checkout main**, et afin de fusionner **git merge test** ( *test* correspondant au nom de la branche que nous voulons fusionner ).
Nous pouvons vérifier que la fusion a fonctionné avec la commande **git log --graph --oneline --all --decorate --topo-order**

Puis réalisons l'exercie. *Athos* et *Porthos*, ayant fait les 3.1 et 3.2 séparément sans synchronisation avec le dépôt github, peuvent supprimer le fichier *test.txt* du dépôt avec **git rm test.txt puis git commit -m "test.txt supprimé"**.

Pour finir, chacun de nous allos créer une branche **AthosCoin** ou **PorthosCoin**. Nous allons notre propre crypto-monnaie, puis fusionner notre banche avec la branche principale. Puis s'assurer que les modifications sont synchronisées dans le dépôt github.

***

*FIN DU TP3*