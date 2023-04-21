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

Nous procédons ensuite à la création d'un fichier au format *markdown*, le remplir puis l'enregistrer.   

Nous pouvons voir maintenant, grace à la commande **git status** que le fichier a été modifier, il faut donc le sélectionner, l'inclur dans le dépôt git avec les commandes respectives : 

* **git add README.md**
* **git commit -m "Ajoute du fichier README.md"**

Maintenant, le fichier README.md est synchronisé avec le dépôt. Nous venons d’enregistrer une première version du fichier.

#### 3.2 Fusionner la branche de test dans la branche principale

***

Nous allons développer notre projet de Cryptomonnaie en java pour bien comprendre la gestion des fichiers.  

Nouvelle commande
* créer un fichier vide avec la commande **touch**

Nous avons donc complété les programmes .java qui étaient à notre disposition, que nous avons mit dans un sous répertoire *src*.  

Nous avons du donc ajoutez et validez le fichier java au dépôt git, avec les mêmes commandes **git add Cryptommonaie**, **git commit -m "Première version du fichier Cyptomonnaie.java"**.

Nous créons aussi un fichier **.gitignore** pour placer nos .class, avec les commandes
* **touch .gitignore**

Puis ajouter et valider avec **add** et **commit -m**.

***

*FIN DU TP3*