GUID=`cf app grouped --guid`
cf curl /v2/apps/$GUID/instances/1 -X 'DELETE' 
