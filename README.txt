# Pong-Reseau
Pong game network


port server à l'écoute de demande de connection du client au server: 5000 (client: tempTx)

port server à l'écoute du client 1: 5010 (client: Tx)
port server à l'écoute du client 2: 5020 (client: Tx)

port client réception à l'écoute du serveur: 5001 (client: Rx)



Client: 
-  State 1: Menu de connexion (enter l'ip)
-  State 2: Menu d'attente de connexion au serveur (le client envoie "he oh" et attends le numero de portTx)
-  State 3: Menu d'attente de connexion du deuxième joueur
-  State 4: Jeu

PacketTypes:
- #heho$
- #pads$<Pad0.Y>$<Pad1.Y>$


