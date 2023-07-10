<template>
    <v-card outlined>
        <v-card-title>
            CreateDateSchedule
        </v-card-title>

        <v-card-text>
            <String label="Id" v-model="value.id" :editMode="editMode"/>
            <String label="UserProfileId" v-model="value.userProfileId" :editMode="editMode"/>
            <Address offline label="Location" v-model="value.location" :editMode="editMode" @change="change"/>
            <String label="Date" v-model="value.date" :editMode="editMode"/>
            <String label="Time" v-model="value.time" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createDateSchedule"
            >
                CreateDateSchedule
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateDateScheduleCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.id = '';
            this.value.userProfileId = '';
            this.value.location = {};
            this.value.date = '';
            this.value.time = '';
        },
        watch: {
        },
        methods: {
            createDateSchedule() {
                this.$emit('createDateSchedule', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

