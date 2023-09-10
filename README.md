# Bysykkel_statusapp

API for sanntidsinfo fra Oslo Bysykkel: https://oslobysykkel.no/apne-data/sanntid
- Station information CURL:
```Bash
curl -H "Client-Identifier: IDENTIFIER" \
  https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json
```
- Tilgjengelighet CURL:
```Bash
curl -H "Client-Identifier: IDENTIFIER" \
  https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json
```


Har tenkt å lage et python script i batchBot appen:
- Take in a text file 
- Tokenize the text file
- If longer than 11k tokens, split into batches of 11k tokens
- For each batch, run the function call that append the insights to the insights variable
- When all batches are done, run the function that cleans up the insights variable/ removes duplicates and returns the cleaned up insights to the user
